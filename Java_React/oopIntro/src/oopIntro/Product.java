package oopIntro;

public class Product {
	
	//Constructor----> Bu class çalýþtýðýnda alýþmasý gereken kodlarýmý yazdýðým kod bloðudur.
	public Product() {
		System.out.println("Ben Çalýþtým");
	}
	
	//Ayný isimde birden fazla metot bulunabilir buna overloading denir.
	public Product(int id, String name, double unitPrice, String detail){
		this();
		this.id=id;
		this.name=name;
		this.unitPrice =unitPrice;
		this.detail=detail;
	}
	int id;
	String name;
	double unitPrice;
	String detail;
}
