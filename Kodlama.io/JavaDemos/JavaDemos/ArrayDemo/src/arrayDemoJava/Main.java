package arrayDemoJava;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Ayþe";
		String ogrenci2="Mehmet";
		String ogrenci3="Fatma";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("----------Array--------------");
		
		String[] ogrenciler=new String[4];
		ogrenciler[0]="Fatih";
		ogrenciler[1]="Gülþah";
		ogrenciler[2]="Dilara";
		ogrenciler[3]="Asiye";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------Foreach Mantýðý-------------");
		for(String ogrenci: ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
