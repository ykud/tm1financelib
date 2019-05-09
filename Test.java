package tm1financelib;

import org.apache.poi.ss.formula.eval.StringEval;
import org.apache.poi.ss.formula.eval.NumberEval;
import org.apache.poi.ss.usermodel.DateUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.formula.eval.ErrorEval;

import com.ibm.cognos.tm1.javati.logging.LogFactory;
import com.ibm.cognos.tm1.javati.logging.Logger;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getExcelDate(java.util.Date date)
		 //org.apache.poi.ss.usermodel.DateUtil dateUtil = new  org.apache.poi.ss.usermodel.DateUtil.;
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 Date startDate = new Date();
		 Date endDate = new Date();
		 String method = "FALSE";
		 try {
			  startDate = df.parse("03/07/2016");
			  endDate = df.parse("30/09/2016");
		 } catch (ParseException e) {
		        e.printStackTrace();
		}
		org.apache.poi.ss.formula.functions.Days360 ds = new org.apache.poi.ss.formula.functions.Days360();
		System.out.println  (((NumberEval ) ds.evaluate(0,0,
				new NumberEval(org.apache.poi.ss.usermodel.DateUtil.getExcelDate(startDate)),
				new NumberEval(org.apache.poi.ss.usermodel.DateUtil.getExcelDate(endDate)), 
				new StringEval(method))).getNumberValue());
		//(ds.DAYS360("1-1-2001","1-1-2001","FALSE").getErrorString());
	}

}
