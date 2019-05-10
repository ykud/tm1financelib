package tm1financelib;

import org.apache.poi.ss.formula.functions.*;

public class NPV { 
	public static double NPV(double r, String [] values)
	{
		//Log.info("Received the following arguments :" + guess);
		  double[] nums = new double[values.length];
		  for (int i = 0; i < nums.length; i++) {
			  //Log.info("Converting number " + values[i]);
		      nums[i] = Double.parseDouble(values[i]);
		     // Log.info("resulting number " + nums[i]);
		      
		  }
		return org.apache.poi.ss.formula.functions.FinanceLib.npv(r, nums);
		//
	}
}
 