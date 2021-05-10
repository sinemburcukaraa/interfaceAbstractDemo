package abstracts;

import entites.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);
}
