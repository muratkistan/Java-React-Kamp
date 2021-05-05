package buy_game.business;

import buy_game.entities.Gamer;
import buy_game.service.GamerCheckService;
import buy_game.service.GamerService;

public class GamerManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	
	
	

	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	

	@Override
	public void addGamer(Gamer gamer) {
		
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Kullanici kaydedildi -> "+ gamer.getFirstName()+" "+ gamer.getLastName());
		}else {
			System.out.println("Kullanici bilgileri hatali\n");
		}
		
	}

	@Override
	public void updateGamer(Gamer gamer) {
		System.out.println("Kullanici Guncellendi -> "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		System.out.println("Kullanici silindi -> "+gamer.getFirstName()+" "+gamer.getLastName());
	}

}
