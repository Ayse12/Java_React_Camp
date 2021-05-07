package classesWithAttributes;

public class Product {
	//Constructor
	public Product(int id,String name,String description,double price, int stockAmount) {
		System.out.println("Constructor çalýþýyor");
		this.id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
	}
	public Product() {
		System.out.println("Constructor çalýþýyor");
	}
	private int id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	
	//Get-->Getter yani getir al demektir. Okumaya yönelik iþlemlerdir.
	//Set-->Setter yani kurmak vermek olarak düþünülebilir. Bir deðer atamaya yarar.
	
	//id okuma
	public int getId() {
		return id;
	}
	
	//SET-->Bir deðer atanmasý gerkmektedir bu yüzden void  metodu kullanýlýr ve dýþarýdan bir deðer girilmesi beklenilir.
	public void setId(int id) {
		this.id=id;
	}
	//This benim içerisinde bulunduðum class anlamýna gelir.

	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	
}
