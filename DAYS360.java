package tm1financelib;


import org.apache.poi.ss.formula.eval.StringEval;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.eval.NumberEval;
import com.ibm.cognos.tm1.javati.logging.LogFactory;
import com.ibm.cognos.tm1.javati.logging.Logger;

public class DAYS360 { 
	private static final Logger Log = LogFactory.getLogger(DAYS360.class);
		
	public static double DAYS360(String start_date, String end_date, String method)
	{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 Date startDate = new Date();
		 Date endDate = new Date();
		 try {
			  startDate = df.parse(start_date);
			  endDate = df.parse(end_date);
		 } catch (ParseException e) {
		        e.printStackTrace();
		}
		org.apache.poi.ss.formula.functions.Days360 ds = new org.apache.poi.ss.formula.functions.Days360();
		return ((NumberEval ) ds.evaluate(0,0,
					new NumberEval(org.apache.poi.ss.usermodel.DateUtil.getExcelDate(startDate)),
					new NumberEval(org.apache.poi.ss.usermodel.DateUtil.getExcelDate(endDate)), 
					new StringEval(method))).getNumberValue();
	}
	
}
 