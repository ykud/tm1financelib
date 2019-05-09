package tm1financelib;

import org.apache.poi.ss.formula.*;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.formula.eval.ValueEval;

public class VARP { 
	public static double VARP(String [] values)
	{
		ValueEval [] nums = new NumberEval[values.length];
		  for (int i = 0; i < nums.length; i++) {
		      nums[i] = new NumberEval(Double.parseDouble(values[i]));
		  }
		 return ((NumberEval) org.apache.poi.ss.formula.functions.AggregateFunction.VARP.evaluate(nums,0,0)).getNumberValue();
	}
}
 