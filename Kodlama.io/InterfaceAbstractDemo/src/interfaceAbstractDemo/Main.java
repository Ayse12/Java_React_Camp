package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseManager = new StarbucksCustomerManager(new MernisServiceAdapter() );
		baseManager.Save(new Customer(1,"Ahmet","Mehmet",new GregorianCalendar(2021, 05, 03),"10000000000"));

	}

}
