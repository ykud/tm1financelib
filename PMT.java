package tm1financelib;

import org.apache.poi.ss.formula.functions.*;

public class PMT { 
	public static double PMT(double r, double n, double y, double p, boolean t)
	{
		return org.apache.poi.ss.formula.functions.FinanceLib.pmt(r, n, y, p, t);
		//
	}
}
 