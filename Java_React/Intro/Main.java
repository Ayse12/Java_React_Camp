public class Main {
  public static void main(String[] args) {
    String internetSubeButonu ="İnternet Şubeye Gir";

    System.out.println("Hello world!");
    System.out.println("---------------------");

    System.out.println(internetSubeButonu);
    

    double dolorDun=8.15;
    double dolorBugun=9.20;
    int vade=36;
    boolean dustuMu=false;

    System.out.println("----------Dolar Düştü Mü?-----------");
    if(dolorBugun<dolorDun){
      System.out.println("Dolar Düştü Resmi");
    }else if(dolorBugun>dolorDun){
      System.out.println("Dolar Yükseldi Resmi");
    }else{
      System.out.println("Dolar Eşittir Resmi");
    }

    System.out.println("----------foreach mantığı-----------");
    String[] krediler={
      "İhtiyaç Kredisi",
      "Konut Kredisi",
      "Taşıt kredisi",
      "Ticari krediler",
      "Kurumsal krediler"
    };

    //foreach
    for(String kredi : krediler){
      System.out.println(kredi);
    }

    System.out.println("---------for mantığı------------");
    for(int i=0; i<krediler.length;i++){
            System.out.println(krediler[i]);
     }
    System.out.println("---------------------");
    
    int[] sayilar1={1,2,3,4,5};
    int[] sayilar2={10,20,30,40,50};
    sayilar1=sayilar2;
    sayilar2[0]=100;
    System.out.println(sayilar1[0]);

    String sehir1="Ankara";
    String sehir2="İstanbul";
    sehir1=sehir2;
    sehir2="İzmir";
    System.out.println(sehir1);
  }
}