package tm1financelib;

import org.apache.poi.ss.formula.*;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;

public class RATE { 
	public static double RATE(String [] values)
	{
		ValueEval [] nums = new NumberEval[values.length];
		  for (int i = 0; i < nums.length; i++) {
		      nums[i] = new NumberEval(Double.parseDouble(values[i]));
		  }
		  org.apache.poi.ss.formula.functions.Rate rate = new org.apache.poi.ss.formula.functions.Rate();
		  return ((NumberEval) rate.evaluate(nums, 0,0)).getNumberValue();
	}
}
 