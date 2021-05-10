package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entites.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;

	public StarbuckCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
	       super.save(customer);
		}
		else {
          System.out.println("not a valid person");	
        }
	}

}
