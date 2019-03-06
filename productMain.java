
public class productMain {

	public static void main(String[] args) {
		//Create shampoo instance with price
		Product shampoo = new Product("Shampoo", 4.50);//create new shampoo product
		shampoo.changeDesc("Used for washing hair");
		shampoo.addCount(5); //add 5 more to product count
		
		//shampoo toString and formatted price		
		System.out.println(shampoo.toString());
		System.out.println(shampoo.getPriceFormatted());
		
		//manipulate count of shampoo and show update with toString
		shampoo.subCount(2);
		System.out.println(shampoo.toString());
		System.out.println();
		
		//create toothpaste instance with description
		Product toothpaste = new Product("Toothpaste", "Used for brushing teeth"); //create new toothpaste product
		//update price with setter method
		toothpaste.changePrice(2.50);
		
		//show product info with toString
		System.out.println(toothpaste.toString());
		System.out.println(shampoo.getPriceFormatted());
		
		//modify product name for toothpaste and show updates with toString
		toothpaste.changeName("Toothbrush");
		System.out.println(toothpaste.toString());
	}

}
