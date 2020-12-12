package oop;

class Cricketer {
	protected String name, country;

	public Cricketer(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.country);
	}
}

class Batsman extends Cricketer {
	protected int runs;

	public Batsman(String name, String country, int runs) {
		super(name, country); // call superclass constructor
		this.runs = runs;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.runs);
	}

	public int getPoints() {
		return this.runs / 50;
	}
}

class Bowler extends Cricketer {
	protected int wickets;

	public Bowler(String name, String country, int wickets) {
		super(name, country); // call superclass constructor
		this.wickets = wickets;
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.wickets);
	}

	public int getPoints() {
		return this.wickets / 2;
	}
}


public class TestInheritance {
	
//	public static void print(Batsman b) {
//		b.print();
//		System.out.println(b.getPoints());
//	}
//	public static void print(Bowler b) {
//		b.print();
//		System.out.println(b.getPoints());
//	}
	
	public static void print(Cricketer c) {
		c.print();  // Runtime polymorphism 
	}

	public static void main(String[] args) {
		Batsman batsman = new Batsman("Dhoni", "India", 4500);
		Bowler bowler = new Bowler("Warne", "Aus", 600);
		print(batsman);
		print(bowler);
     	 
	}

}
