
public class Main {

	public static void main(String[] args) {
		//Dizi içerisindeki elemanlarýn tanýmlanmasý
		Kurslar kurs1=new Kurslar(1,"Yazýlým Geliþtirici Yetiþtirme Kampý ",150,"(C# + ANGULAR)");
		Kurslar kurs2=new Kurslar(2,"Yazýlým Geliþtirici Yetiþtirme Kampý ",250,"(JAVA + REACT)");
		Kurslar kurs3=new Kurslar(3,"Programlamaya Giriþ",100,"Temel Kurs");
		
		//Tanýmlanmýþ elemanlarý dizi içerine yerleþtirme
		Kurslar[] kurslar= {kurs1,kurs2,kurs3};
		
		System.out.println(" ");
		System.out.println("-------For ile dizi içinde gezinme-------");
		for(Kurslar kurs : kurslar) {
			System.out.println("Kursun Adý : "+kurs.name);
			System.out.println("Fiyatý : "+kurs.Fiyati);
			System.out.println("Kursun Açýklamasý : "+ kurs.Aciklama);
			System.out.println(" ");
		}
		
		//Metot çaðrýlmasý
		KursManager kurs=new KursManager();
		kurs.Add(kurs1);
		kurs.Update(kurs3);

	}

}
