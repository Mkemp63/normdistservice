package test; /**
 * Created by Matthijs on 23-6-2017.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {


    boolean b = false;
    public boolean checkResult(double skewness, double kurtosis){
        if (skewness <= 0.1 && skewness >= -0.1 && kurtosis <= 0.1 && kurtosis >= -0.1){
            b = true;
        }else {
            b=false;
        }
        return b;
        }
    assertFalse(checkResult(5,5));
    assertTrue(checkResult(-0.01,0.03));
    assertFalse(checkResult(-5,-5));





}