package tm1financelib;

import org.apache.poi.ss.formula.*;


public class IPMT { 
	public static double IPMT(double r, int per, int n, double y, double p, int t)
	{
		return org.apache.poi.ss.formula.functions.Finance.ipmt( r,  per,  n,  y,  p,  t);
	}
}
 