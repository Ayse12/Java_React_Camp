package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//Statik ile kullaným
		if (ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersiz.");
		}
	}
	
}
