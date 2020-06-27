package om.sri.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseService {
	protected Date parseDate(String date) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		return formatter.parse(date);
	}
}
