package libdemo;

public class Time implements Comparable<Time>{
	private int h, m, s;

	public Time(int h, int m, int s) {
		super();
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public int totalSeconds() {
		return  this.h * 3600 + this.m * 60 + this.s;
	}

	@Override
	public String toString() {
		return "Time [h=" + h + ", m=" + m + ", s=" + s + "]";
	}

	@Override
	public int compareTo(Time other) {
		  return  this.totalSeconds() - other.totalSeconds();
	}

}
