package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		mesajVer(12);

	}
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,4,5,6};
		int aranacak=5;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi Mevcuttur");
		}else {
			System.out.println("Sayi Mevcut deðildir.");
		}
	}
	public static void mesajVer(int aranacak) {
		System.out.println("Sayý mevcuttur: "+aranacak);
	}

}
