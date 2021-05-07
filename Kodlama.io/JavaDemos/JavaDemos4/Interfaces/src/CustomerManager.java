
public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal ıCustomerDal) {
		this.customerDal = ıCustomerDal;
	}

	public void add() {
		//İş Kodları
		customerDal.Add();
	}
}
