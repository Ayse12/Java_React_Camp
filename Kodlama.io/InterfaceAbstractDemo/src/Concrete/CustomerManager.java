package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager implements ICustomerCheckService  {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
		
	}
}
