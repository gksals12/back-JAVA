package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Date date = new Date();

		System.out.println(date);
		System.out.println(simpleDateFormat.format(date));
		
		try {
			System.out.println(simpleDateFormat.parse(simpleDateFormat.format(date)));
		} catch (ParseException e) {;}
	}
}
