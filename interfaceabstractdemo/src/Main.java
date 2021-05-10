import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbuckCustomerManager;
import entites.Customer;

public class Main {

	public static void main(String[] args) {
		 BaseCustomerManager baseCustomerManager=new StarbuckCustomerManager(new MernisServiceAdapter());
		 baseCustomerManager.save(new Customer(1,"Sinem Burcu","Kara","123456789",LocalDate.parse("2000-07-24"))); 
		 
	}

}
