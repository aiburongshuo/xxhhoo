package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormart {
	/**
	 * 字符串转日期对象
	 * @param date 日期字符串
	 * @param format 转换格式
	 * @return
	 * @throws ParseException 
	 */
	public static Date stringToDate(String date,String format) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
}
