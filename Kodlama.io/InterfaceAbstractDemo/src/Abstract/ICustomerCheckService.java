package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
	Result CheckIfRealPerson(Customer customer);
	Result CheckIfYoungerAgeThan(Customer customer, int age);
}
