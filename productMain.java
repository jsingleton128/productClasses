
public class productMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product shampoo = new Product("Shampoo", 4.50);//create new shampoo product
		shampoo.description = "Used for washing hair";
		shampoo.addCount(5); //add 5 more to product count
				
		System.out.println(shampoo.toString());
		System.out.println(shampoo.getPriceFormatted());
				
		shampoo.subCount(2);
		System.out.println(shampoo.toString());
		System.out.println();
				
		Product toothpaste = new Product("Toothpaste", "Used for brushing teeth"); //create new toothpaste product
		toothpaste.price = 2.50;
		System.out.println(toothpaste.toString());
		System.out.println(shampoo.getPriceFormatted());
	}

}
