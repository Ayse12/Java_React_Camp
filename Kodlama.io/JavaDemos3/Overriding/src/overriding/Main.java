package overriding;

public class Main {

	public static void main(String[] args) {
		//ilkdeneme();
		ikincideneme();
		
	}
	public static void ilkdeneme() {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		System.out.println(ogretmenKrediManager.hesapla(1000));
	}
	
	public static void ikincideneme() {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarımKrediManager(), new OgretmenKrediManager()};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1000));
			
		}
	}
}
