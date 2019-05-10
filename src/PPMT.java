package tm1financelib;

import org.apache.poi.ss.formula.*;


public class PPMT { 
	public static double PPMT(double r, int per, int n, double y, double p, int t)
	{
		return org.apache.poi.ss.formula.functions.Finance.ppmt( r,  per,  n,  y,  p,  t);
	}
}
 