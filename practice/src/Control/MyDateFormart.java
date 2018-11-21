package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormart {
	/**
	 * �ַ���ת���ڶ���
	 * @param date �����ַ���
	 * @param format ת����ʽ
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDate(String date,String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
}
