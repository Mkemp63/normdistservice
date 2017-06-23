package nl.hu.iac.wsconsumer;

import java.math.BigInteger;

import nl.hu.iac.wsinterface.Fault;
import nl.hu.iac.wsinterface.ObjectFactory;
import nl.hu.iac.wsinterface.NormdistRequest;
import nl.hu.iac.wsinterface.NormdistResponse;
import nl.hu.iac.wsinterface.NormdistServiceService;

public class WSConsumer {

	public static void main(String[] args) {
		NormdistServiceService service = new NormdistServiceService();
		NormdistRequest request = new ObjectFactory().createNormdistRequest();
		System.out.println("Kurtosis: "+request.getKurtosis()+ " en Skewness: " +request.getSkewness());
		NormdistResponse response = null;
		try {
			response = service.getWSPort().calculateNormdist(request);
		} catch (Fault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
