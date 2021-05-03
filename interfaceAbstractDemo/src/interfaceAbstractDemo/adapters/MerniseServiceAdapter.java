package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.abstracts.CustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniseServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()) ,customer.getFirstName().toUpperCase(),
											customer.getLastName().toUpperCase(),customer.getYearOfBirth());
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
