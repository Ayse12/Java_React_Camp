package classes;

public class Main {

	public static void main(String[] args) {
		//Reference Type
		CustomerManager customer1=new CustomerManager();
		customer1.Add();
		customer1.Remove();
		customer1.Update();
		
		//value
		int sayi1=100;
		int sayi2=200;
		sayi2=sayi1;
		sayi1=300;
		System.out.println(sayi2);
		
		int [] sayilar1=new int[] {1,2,3,4};
		int [] sayilar2=new int[] {10,20,30,40};
		
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
