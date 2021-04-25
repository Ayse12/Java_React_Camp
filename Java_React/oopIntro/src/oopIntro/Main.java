package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"HP",15000,"16 GB Ram");
		product1.id=1;
		product1.name="HP";
		product1.unitPrice=15000;
		product1.detail="16 GB Ram";
		
		Product product2=new Product();
		product2.id=2;
		product2.name="Dell";
		product2.unitPrice=16000;
		product2.detail="32 GB Ram";
		
		Product product3=new Product();
		product3.id=3;
		product3.name="ASUS";
		product3.unitPrice=30000;
		product3.detail="64 GB Ram";
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("-------For ile dizi içinde gezinme-------");
		for(Product product:products) {
			System.out.println(product.name);
		}
		System.out.println(" ");
		
		
		System.out.println("-------Dizideki eleman sayýsý-------");
		System.out.println(products.length);
		System.out.println(" ");
		
		
		
		//Category oluþturma
		Category category1=new Category();
		category1.id=1;
		category1.name="Bilgisayar";
		
		Category category2=new Category();
		category2.id=1;
		category2.name="Bilgisayar";
		
		//ProductManager
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
