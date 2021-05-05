package buy_game.adapter;

import java.rmi.RemoteException;

import buy_game.entities.Gamer;
import buy_game.service.GamerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements GamerCheckService {

	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		
			try {
				return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),
						gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return false;
		
	}

}
