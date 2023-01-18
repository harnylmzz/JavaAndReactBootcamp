package gameDemo;

import java.rmi.RemoteException;

import gameDemo.business.concretes.CampaignManager;
import gameDemo.business.concretes.CustomerManager;
import gameDemo.business.concretes.GameManager;
import gameDemo.entitiy.Campaing;
import gameDemo.entitiy.Customer;
import gameDemo.entitiy.Game;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		// customer
		Customer customer = new Customer(1, "xxx@gmail.com", "123456", "@harnylmzz10line");
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);

		// campaign
		Campaing campaing = new Campaing(1, "Indirim");
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.startACampaign(campaing);

		// game
		Game game = new Game(1, "GTA Vice City");
		GameManager gameManager = new GameManager();
		gameManager.sales(customer, game);

	}

}
