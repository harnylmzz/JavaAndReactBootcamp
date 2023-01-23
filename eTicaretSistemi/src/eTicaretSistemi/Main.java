package eTicaretSistemi;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.business.concretes.UserManager;
import eTicaretSistemi.core.GoogleAdapter;
import eTicaretSistemi.dataAccess.concretes.HibernateUserRepository;
import eTicaretSistemi.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new HibernateUserRepository(), new GoogleAdapter());

		User user1 = new User(1, "Harun", "Yilmaz", "birisi@gmail.com", "123456", true);
		User user2 = new User(1, "Mauro", "Icardi", "icardi@gmail.com", "123456123", true);

		userService.signUp(user1);
		userService.confirm(user1);
		userService.login(user1);
		

	}

}
