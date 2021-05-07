
public class Main {

	public static void main(String[] args) {
		//interfaces();
		interfacesPolymorphism();
		
		
	}
	
	public static void interfaces() {
		//Ýnterfaces newlenemez.
		//Birden fazla class'ý iplement edebilirsiniz.
		//Extends edilemez.
		ICustomerDal customerDal = new MySqlCustomerDal();
		customerDal.Add();
	}
	
	public static void interfacesPolymorphism() {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
