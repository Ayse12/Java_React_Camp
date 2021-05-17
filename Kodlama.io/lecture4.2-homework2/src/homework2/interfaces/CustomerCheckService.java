package homework2.interfaces;

import homework2.entities.Customer;

public interface CustomerCheckService {
	Result CheckIfRealPerson(Customer customer);
	Result CheckIfYoungerAgeThan(Customer customer, int age);
}
