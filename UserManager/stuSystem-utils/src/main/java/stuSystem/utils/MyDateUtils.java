package stuSystem.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateUtils {

private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	
	public static String formate(Date date){
		return sdf.format(date);
	}
	
	public static Date parse(String date){
		try {
			return sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
