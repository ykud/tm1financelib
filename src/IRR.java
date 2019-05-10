package tm1financelib;
import java.lang.Math;
import com.ibm.cognos.tm1.javati.TM1UserThread;
import com.ibm.cognos.tm1.javati.JavaTI;
import com.ibm.cognos.tm1.javati.ti.TIFunctions;
import com.ibm.cognos.tm1.javati.logging.LogFactory;
import com.ibm.cognos.tm1.javati.logging.Logger;
public class IRR {

	
	/**
     * Calculates IRR using the Newton-Raphson Method.
     * <p>
     * Starting with the guess, the method cycles through the calculation until the result
     * is accurate within 0.00001 percent. If IRR can't find a result that works
     * after 20 tries, the Double.NaN<> is returned.
     * </p>
     * <p>
     *   The implementation is inspired by the NewtonSolver from the Apache Commons-Math library,
     *   @see {http://commons.apache.org/}
     * </p>
     *
     * @param values        the income values.
     * @param guess         the initial guess of irr. 
     * @return the irr value. The method returns <code>Double.NaN</code>
     *  if the maximum iteration count is exceeded
     *
     * @see {http://en.wikipedia.org/wiki/Internal_rate_of_return#Numerical_solution}
     * @see {http://en.wikipedia.org/wiki/Newton%27s_method}
    
    public static double IRR(String[] values) {
        int maxIterationCount = 20;
        double absoluteAccuracy = 1E-7;

        double x0 = 1;
        double x1;

        int i = 0; 
        while (i < maxIterationCount) {

            // the value of the function (NPV) and its derivate can be calculated in the same loop
            double fValue = 0;
            double fDerivative = 0;
            for (int k = 0; k < values.length; k++) {
                fValue += values[k] / Math.pow(1.0 + x0, k);
                fDerivative += -k * values[k] / Math.pow(1.0 + x0, k + 1);
            }

            // the essense of the Newtotm1n-Raphson Method 
            x1 = x0 - fValue/fDerivative;

            if (Math.abs(x1 - x0) <= absoluteAccuracy) {
                return x1;
            }

            x0 = x1;
            ++i;
        }
        // maximum number of iterations is exceeded
        return Double.NaN;
    }
     */ 
	  private static final Logger Log = LogFactory.getLogger(IRR.class);
	  public static double IRR(double guess,String [] inp) {
		  //Log.info("Received the following arguments :" + guess + inp[0]);
		  // replacing the header and trailing quotes
		  //String stringVal = inp[0].substring(1, inp[0].length()-1);
		  String [] values = inp[0].split(",");   
		  double[] nums = new double[values.length];
		  for (int i = 0; i < nums.length; i++) {
			 // Log.info("Converting number " + values[i]);
		      nums[i] = Double.parseDouble(values[i]);
		     // Log.info("resulting number " + nums[i]);
		      
		  } 
		  return org.apache.poi.ss.formula.functions.Irr.irr(nums, guess);	
	  }
}
