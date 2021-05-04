package oopIntro;

public class Main {

	public static void main(String[] args) {
		//GetSetProductTest();
		CategoryTest();
		
		
		
		
	}
	private static void GetSetProductTest() {
		Product product1=new Product(1,"HP",15000,"16 GB Ram",10);
		product1.setId(1);
		product1.setName("HP");
		product1.setUnitPrice(15000);
		product1.setDetail("16 GB Ram");
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Dell");;
		product2.setUnitPrice(16000);;
		product2.setDetail("32 GB Ram");;
		
		Product product3=new Product();
		product3.setId(3);
		product3.setName("ASUS");;
		product3.setUnitPrice(30000);;
		product3.setDetail("64 GB Ram");
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("-------For ile dizi içinde gezinme-------");
		for(Product product:products) {
			System.out.println(product.getName());
		}
		System.out.println(" ");
		
		
		System.out.println("-------Dizideki eleman sayýsý-------");
		System.out.println(products.length);
		System.out.println(" ");
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		//ProductManager
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
				
		
	}
	
	private static void CategoryTest() {
		//Category oluþturma
			Category category1=new Category();
			category1.setId(1);
			category1.setName("Bilgisayar");
					
			Category category2=new Category();
			category2.setId(2);
			category2.setName("Laptop");
			System.out.println(category1.getName());
			System.out.println(category2.getName());
	 }
	

}
