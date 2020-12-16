package libdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		var d = new Date();
		
		var df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(d));
		
		var tf = DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println(tf.format(d));
		
		var sdf = new SimpleDateFormat("d-M-yyyy H:m:s");
		System.out.println(sdf.format(d));
	}
}
