package oop;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("iPhone 11", 80000);
		Product p2 = new Product("iPhone 11", 80000);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
	}

}
