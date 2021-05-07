package stringsDemoJava;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman Sayýsý:"+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.concat("Yaþasýn!"));
		
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));*/
		
		String yeniMesaj= mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println("---------------");
		
		System.out.println("----------Tüm Harfleri küçük harf yapar----------");
		System.out.println(mesaj.toLowerCase());
		System.out.println("----------Tüm Harfleri büyük harf yapar----------");
		System.out.println(mesaj.toUpperCase());
		
		System.out.println("                     ");
		String mesaj2="       Hayat Yaþayýnca Güzel.    ";
		System.out.println(mesaj2);
		System.out.println("------Trim ifadesiyle metnin baþýndaki ve sonundaki boþluklarý silmiþ oluruz-----");
		System.out.println(mesaj2.trim());
	}

}
