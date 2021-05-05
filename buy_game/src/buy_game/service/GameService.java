package buy_game.service;

import buy_game.entities.Campaign;
import buy_game.entities.Game;
import buy_game.entities.Gamer;

public interface GameService {
	
	public void addGame(Game game);
	public void updateGame(Game game);
	public void deleteGame(Game game);
	public void sellGame(Game game, Gamer gamer);
	public void sellGame(Game game, Gamer gamer,Campaign campaign);

}
