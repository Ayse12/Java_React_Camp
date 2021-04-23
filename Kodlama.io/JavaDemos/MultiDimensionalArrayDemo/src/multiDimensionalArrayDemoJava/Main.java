package multiDimensionalArrayDemoJava;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler=new String[3][3];
		
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Ankara";
		sehirler[0][2]="Bursa";
		sehirler[1][0]="Diyarbakýr";
		sehirler[1][1]="Yozgat";
		sehirler[1][2]="Sivas";
		sehirler[2][0]="Ýzmir";
		sehirler[2][1]="Rize";
		sehirler[2][2]="Konya";
		
		for(int i = 0; i<=2;i++) {
			System.out.println("-----------------------");
			for(int j=0; j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
