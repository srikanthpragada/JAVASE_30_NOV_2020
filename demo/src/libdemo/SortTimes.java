package libdemo;

import java.util.Arrays;

public class SortTimes {

	public static void main(String[] args) {
		Time times [] = { new Time(1,2,3), new Time(10,20,30), new Time(5,6,7)};
		
		Arrays.sort(times);
		
		for (Time t : times)
			System.out.println(t.toString());
	}

}
