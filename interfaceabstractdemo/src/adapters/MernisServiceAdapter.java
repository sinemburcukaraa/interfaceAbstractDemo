package adapters;

import abstracts.ICustomerCheckService;
import entites.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateofbirth().getYear());
		}
		catch (Exception e) {
		    result = false;
			System.out.println("hata");
			e.printStackTrace();
		}

		return result;

	}
}


