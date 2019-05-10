package tm1financelib;

import org.apache.poi.ss.formula.functions.*;

public class PV { 
	public static double PV(double r, double n, double y, double f, boolean t)
	{
		return org.apache.poi.ss.formula.functions.FinanceLib.pv(r, n, y, f, t);
		//
	}
}
 