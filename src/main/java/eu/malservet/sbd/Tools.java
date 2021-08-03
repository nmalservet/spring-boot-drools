package eu.malservet.sbd;

import java.util.Calendar;
import java.util.Date;

public class Tools {
	
	public static int computeAge(Date date1) {
	    long millis = new Date().getTime()-date1.getTime() ;
	    Calendar c = Calendar.getInstance(); 
	  //Set time in milliseconds
	  c.setTimeInMillis(millis);
	    return c.get(Calendar.YEAR)-1970;
	}

}
