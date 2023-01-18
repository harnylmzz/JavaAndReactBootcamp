package gameDemo.business.abstracts;

import gameDemo.entitiy.Customer;
import gameDemo.entitiy.Game;

public interface GameService {
	void add(Game game);

	void sales(Customer customer, Game game);

}
