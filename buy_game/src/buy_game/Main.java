package buy_game;

import java.util.Date;

import buy_game.adapter.MernisServiceAdapter;
import buy_game.business.CampaignManager;
import buy_game.business.GameManager;
import buy_game.business.GamerManager;
import buy_game.entities.Campaign;
import buy_game.entities.Game;
import buy_game.entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Game game1 = new Game(1,"FIFA 2021",150);
		Game game2 = new Game(2,"Call of Duty Black Ops",85);
		
		Gamer gamer1 = new Gamer(1,"Murat Ali","KIÞTAN",new Date(2021,01,01),"11111111111","murat@gmail.com","12345");
		
		
		Campaign campaign1 = new Campaign(1, "Anneler Gunu indirimi" ,30 , true , new Date(2021,15,05));
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		GameManager gameManager = new GameManager(); 
		CampaignManager campaignManager = new CampaignManager();
		
		
		
		gamerManager.addGamer(gamer1);
		
		
		gameManager.addGame(game1);

		
		campaignManager.addCampaign(campaign1);
		
		gameManager.sellGame(game1, gamer1, campaign1);
		
		

	}

}
