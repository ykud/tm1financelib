package tm1financelib;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//import com.ibm.cognos.tm1.javati.logging.LogFactory;
//import com.ibm.cognos.tm1.javati.logging.Logger;


public class UnixTimestampToTM1 {
	// private static final Logger Log = LogFactory.getLogger(JAVADATE.class);
	public static String UnixTimestampToTM1(String timest) throws ParseException {
		  Date tm = new Date(Long.parseLong(timest));
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  return  String.valueOf(sdf.format(tm));	
	  }
}
