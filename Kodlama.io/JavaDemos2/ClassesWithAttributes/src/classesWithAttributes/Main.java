package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product();
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus");
		product.set_price(12000);
		product.set_stockAmount(3);
		System.out.println(product.get_name());
		
		Product product1=new Product(2,"fare","ýþýklý",12000,5);
		System.out.println(product1.get_name());
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);

	}

}
