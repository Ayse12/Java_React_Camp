package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {//true dönerse kişiyi kaydet
			
			super.Save(customer);
		}
		else { //dönmezse geçerli kişi deðil
			System.out.println("Geçersiz kullanýcý.");
			
		}
	}
	
	@Override
	public void add(Customer customer) {

		Result result =  CheckServiceUtils.runCheckServices(new Result[] {
				customerCheckService.CheckIfRealPerson(customer), 
				customerCheckService.CheckIfYoungerAgeThan(customer, 15)
				});
		
		if(!result.isSuccess()) {
			System.out.println(result.getMessage());
			return;
		}
		
		super.add(customer);
	}
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	
	
}
