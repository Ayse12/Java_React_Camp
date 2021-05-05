package inheritance;

public class Main {

	public static void main(String[] args) {
		//CustomerAdd();
		CustomerAddMultiple();
		
	}
	public static void CustomerAdd() {
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="1234";
		
		CorporateCustomer trendyol = new CorporateCustomer();
		trendyol.customerNumber="5678";
		
		SendikaCustomer sendikaCustomer=new SendikaCustomer();
		sendikaCustomer.customerNumber="1000";
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add(trendyol);
		customerManager.Add(engin);
		customerManager.Add(sendikaCustomer);
	}
	
	public static void CustomerAddMultiple() {
		IndividualCustomer engin=new IndividualCustomer();
		engin.customerNumber="1234";
		
		CorporateCustomer trendyol = new CorporateCustomer();
		trendyol.customerNumber="5678";
		
		SendikaCustomer abc=new SendikaCustomer();
		abc.customerNumber="1000";
		
		CustomerManager customerManager=new CustomerManager();
		Customer[] customers = {engin,trendyol,abc};
		customerManager.addMultiple(customers);
	}

}
