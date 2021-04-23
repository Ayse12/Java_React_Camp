package sayiBulma;

public class Main {

	public static void main(String[] args) {
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

}
