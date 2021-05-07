package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik Yapýcý blok çalýþtý.");
	}
	//NEW 'lenince çalýþýr.
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	//Statikler direkt class ismiyle çaðrýlýr.
	public static boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bisey() {
		
	}
	
}
