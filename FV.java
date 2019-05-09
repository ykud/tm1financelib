package tm1financelib;

import org.apache.poi.ss.formula.functions.*;

public class FV { 
	public static double FV(double r, double n, double y, double p, boolean t)
	{
		return org.apache.poi.ss.formula.functions.FinanceLib.fv(r, n, y, p, t);
		//
	}
}
 