package eTicaretSistemi.business.abstracts;

import eTicaretSistemi.entities.concretes.User;

public interface UserService {

	
	void signUp(User user);
	void login(User user);
	void confirm(User user);
	
	
}
