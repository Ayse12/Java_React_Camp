package Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import Abstract.ICustomerCheckService;
import Abstract.Result;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	public Result CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationaltyId()),
					customer.getName().toUpperCase(),
					customer.getSurname().toUpperCase(), 
					customer.getDateofBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result) {
			return new Utils.Result(true);
		}else {
			return new Utils.Result(false, "kimlik doðrulama baþarýsýz.");
		}
			
	}


	@Override
	public Result CheckIfYoungerAgeThan(Customer customer, int age) {
		// TODO Auto-generated method stub
		return null;
	}

}
