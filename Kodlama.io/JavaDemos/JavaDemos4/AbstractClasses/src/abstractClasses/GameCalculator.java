package abstractClasses;

//Bir sýnýfýn abstract olabilmesi için abstract ile tanmlanmýþ olmasý gerekmektedir.
public abstract class GameCalculator {
	
	//abstract -> Kim kullanýyorsa kendi hesapla methodunu yazmak zorundadýr. DEFAULT BÝR DEÐERÝ BULUNMAMAKTADIR.
	public abstract void hesapla(); 
	
	//final -> GameCalculator'ý kim kullanýyorsa gameOver 'ý olduðu gibi kullanmak zorundadýr.
	public final void gameOver() {
		System.out.println("Oyun Bitti!");
	}
}
