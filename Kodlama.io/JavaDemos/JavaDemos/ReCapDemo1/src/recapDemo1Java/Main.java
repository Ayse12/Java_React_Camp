package recapDemo1Java;

public class Main {

	public static void main(String[] args) {
		int sayi1=15;
		int sayi2=225;
		int sayi3=86;
		int enBuyuk=sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En büyük ="+enBuyuk);

	}

}
