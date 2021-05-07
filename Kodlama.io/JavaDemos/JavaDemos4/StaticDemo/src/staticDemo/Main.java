package staticDemo;

public class Main {

	public static void main(String[] args) {
		//statics();
		innerClass();

	}
	public static void statics() {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id=1;
		product.name="Telefon";
		product.price=120;
		
		manager.add(product);

	}
	public static void innerClass() {
		DatabaseHelper.Connection.createConnection();

	}

}
