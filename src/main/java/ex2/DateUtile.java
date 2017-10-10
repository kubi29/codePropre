package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtile {
	
	/**
	 * converti une date en string
	 * @param date
	 * @return
	 * @throws ParseException 
	 */
	public static Date formatStringVerDate(String date) throws ParseException {
		
		if(date == null){
			return null;
		}
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		return f.parse(date);
		
	}
	
	public static String formatDateVerString(Date date) throws ParseException {
		
		if(date == null){
			return null;
		}
		
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		return f.format(date);
		
	}

}
