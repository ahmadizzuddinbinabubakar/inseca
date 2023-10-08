package com.izzutech.inseca.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataTypeConverterUtil {

	public static Date stringToDate(String dateString, String dateFormat) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateFormat, Locale.ENGLISH);
		Date date = null;
		try {
			date = formatter.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static BigDecimal stringToBigDecimal(String bigDecimalString) {
		if(bigDecimalString != null) {
			return new BigDecimal(bigDecimalString);
		} else {
			return BigDecimal.ZERO;
		}
	}
}
