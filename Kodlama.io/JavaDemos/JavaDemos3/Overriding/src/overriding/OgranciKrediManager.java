package overriding;

public class OgranciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar * 1.15;
	}
}
