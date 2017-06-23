package nl.hu.iac.wsproducer;

import com.sun.xml.ws.developer.SchemaValidation;
import nl.hu.iac.wsinterface.*;

import javax.jws.WebService;

@WebService(endpointInterface = "nl.hu.iac.wsinterface.NormdistServiceInterface")
@SchemaValidation(handler = SchemaValidationErrorHandler.class)
public class NormServiceImpl implements NormdistServiceInterface {

	@Override
	public NormdistResponse calculateNormdist(NormdistRequest request) throws Fault {
		System.out.println("Request object "+request.getKurtosis()+ " " +request.getSkewness()+ " " );
		ObjectFactory factory = new ObjectFactory();
		NormdistResponse response = factory.createNormdistResponse();
		try {

			if (request.getKurtosis() <= 0.1 && request.getKurtosis() >= -0.1 && request.getSkewness() <= 0.1 && request.getSkewness() >= -0.1){
				response.setResult(true);
			}
			else if(request.getKurtosis() > 0.1 && request.getKurtosis() < -0.1 && request.getSkewness() > 0.1 && request.getSkewness() < -0.1){

				response.setResult(false);
			}
		} catch (RuntimeException e) {
			NormdistFault kurtosis = factory.createNormdistFault();
			kurtosis.setErrorCode((short) 1);
			kurtosis.setMessage("fout");
			Fault fault = new Fault(
					"Er ging iets mis met het berekenen van de normaalverdeling", kurtosis);
			throw fault;
		}
		return response;
	}

}
