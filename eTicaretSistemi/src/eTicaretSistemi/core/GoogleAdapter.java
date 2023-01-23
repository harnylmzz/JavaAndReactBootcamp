package eTicaretSistemi.core;

import eTicaretSistemi.entities.concretes.User;
import eTicaretSistemi.google.GoogleManager;

public class GoogleAdapter implements GoogleService {

	@Override
	public void loginWithGoogle(User user ) {

		GoogleManager googleManager = new GoogleManager();
		googleManager.loginWithGoogle(user);
	}

}
