package oop;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return  this.name + " - " + this.price; 
	}
	
	@Override 
	public boolean equals(Object obj) {
		  if (!(obj instanceof Product))
			  return false;
		  
		  Product other = (Product) obj;   // Downcasting 
		  return this.name.equals(other.name) &&
				 this.price == other.price;
	}
	
	@Override
	public int hashCode() {
		return this.price;
	}
	
}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("iPhone 11", 80000);
		Product p2 = new Product("iPhone 11", 80000);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
	}

}
