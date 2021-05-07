package InheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI kredi = new KrediUI();
		kredi.KrediHesapla(new OgretmenKrediManager());
		kredi.KrediHesapla(new AskerKrediManager());
		kredi.KrediHesapla(new TarımKrediManager());
	}

}
