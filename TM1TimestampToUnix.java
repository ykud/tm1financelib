package tm1financelib;


import java.text.ParseException;
import java.text.SimpleDateFormat;



//import com.ibm.cognos.tm1.javati.logging.LogFactory;
//import com.ibm.cognos.tm1.javati.logging.Logger;


public class TM1TimestampToUnix {
	// Converting the time from TM1 (with server local time zone to Unix epoch)
	// private static final Logger Log = LogFactory.getLogger(JAVADATE.class);
	public static String TM1TimestampToUnix(String dt) throws ParseException {
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  return  String.valueOf(sdf.parse(dt).getTime());	
	  }
}
