package project1230;
import java.text.SimpleDateFormat;
import java.util.*;

public class Time {
	private String time;
	public void check_time() {
		Date date = new Date();
		SimpleDateFormat getTime = new SimpleDateFormat( "HH시mm분ss초");
		this.time = getTime.format(date);
		System.out.println(this.time);
	}
}
