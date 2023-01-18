package gameDemo.business.concretes;

import gameDemo.business.abstracts.GameService;
import gameDemo.entitiy.Customer;
import gameDemo.entitiy.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " isimli oyun eklendi. " );
		
	}

	@Override
	public void sales(Customer customer, Game game) {
		System.out.println(customer.getUserName() + "isimli kullaniciya " +game.getName() + " isimli oyun basari ile satildi." );
		
	}

}
