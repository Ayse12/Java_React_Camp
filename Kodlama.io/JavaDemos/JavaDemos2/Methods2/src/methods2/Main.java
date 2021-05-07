package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün Hava Çok Güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(mesaj);
		System.out.println(sayi);
		güncelle();
		System.out.println(" ");
		
		/////////Variable arguments////////////
		int toplam= topla2(2,3,2,5);
		System.out.println(toplam);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static int topla(int sayi1,int sayi2) {
		return 5;
	}
	public static String sehirVer() {
		return "Diyarbakýr";
	}
	
	//Variables Arguments ->> int sonrasý ... koymak birden fazla int deðeri tanýmlanacaðýný belirlemek için kullanýyoruz. Yani int veri tpinde array gönderilmiþ gibi düþünüllebilir
	public static int topla2(int...sayilar) {
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
