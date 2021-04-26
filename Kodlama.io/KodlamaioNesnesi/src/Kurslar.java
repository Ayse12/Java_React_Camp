
public class Kurslar {
	public Kurslar() {
		System.out.println("Ben Kurslar için Çalýþtým");
	}
	
	//Main'de eleman tanýmlamasý için constructor tanýmladýk.
	public Kurslar(int id, String name, double Fiyati, String Aciklama){
		this();
		this.id=id;
		this.name=name;
		this.Fiyati =Fiyati;
		this.Aciklama=Aciklama;
	}
	
	//Özellikler
	int id;
	String name;
	Double Fiyati;
	String Aciklama;
}
