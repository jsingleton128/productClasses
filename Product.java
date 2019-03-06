import java.text.NumberFormat;

public class Product {
	//fields
	String name;
	String description;
	double price;
	int code;
	int count;
	
	
	//constructors
	public Product(String name) {
		if (name == null) {
			throw new IllegalArgumentException();
		}
		
		this.name = name;
		code = 0;
		description = null;
		price = 0.0;
		count = 0;
	}
		
	public Product(String name, double price) {
		if (name == null || price == 0.0 ) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		code = 0;
		description = null;
		this.price = price;
		count = 0;
	}
	
	public Product(String name, String description) {
		if (name == null || description == null ) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		code = 0;
		this.description = description;
		price = 0;
		count = 0;
	}
	
	public Product(String name, String description, double price, int code, int count) {
		if (name == null || description == null || price == 0.0 || code == 0 ) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.code = code;
		this.description = description;
		this.price = price;
		this.count = count;
	}
	
	//methods
	
	public void addCount(int n) {//add number n to count
		count += n;
	}
	
	public void subCount(int n) {//subtract number n to count
		count -= n;
	}
	
	public String toString() {
		String toString = name + ", " + description + ", " + "count of " + count + ".";
		return toString;
	}

	 public String getPriceFormatted() 
	    {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	        return formattedPrice;
	    }
	

}
