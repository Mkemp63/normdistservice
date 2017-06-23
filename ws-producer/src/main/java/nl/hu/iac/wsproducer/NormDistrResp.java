package nl.hu.iac.wsproducer;

/**
 * Created by Matthijs on 22-6-2017.
 */
public class NormDistrResp {
    private double kurtosis;
    private double skewness;
    private boolean result;

    public NormDistrResp(double kurtosis, double skewness, boolean result){
        this.kurtosis = kurtosis;
        this.skewness = skewness;
        this.result = result;
    }

    public boolean NormallyDistributed(){
        return result;
    }

    public double getKurtosis(){
        return kurtosis;
    }

    public double getSkewness(){
        return skewness;
    }


    public boolean getResult() { return result; }

    public void setKurtosis(double kurtosis){
        this.kurtosis = kurtosis;
    }

    public void setSkewness(double skewness){
        this.skewness = skewness;
    }

    public void setResult(boolean result){
        this.result = result;
    }




}
