package eTicaretSistemi.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemi.business.abstracts.UserService;
import eTicaretSistemi.core.GoogleService;
import eTicaretSistemi.dataAccess.abstracts.UserRepository;
import eTicaretSistemi.entities.concretes.User;

public class UserManager implements UserService {

	private UserRepository userRepository;
	private GoogleService googleService;

	public UserManager(UserRepository userRepository, GoogleService googleService) {
		super();
		this.userRepository = userRepository;
		this.googleService = googleService; 
	}

	@Override
	public void signUp(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Eksik karakter tusladiniz!");
		}
		final String emailPattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		final Pattern pattern = Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(user.getEmail());
		if (matcher.matches()) {
			System.out.println(user.getEmail() + " gecerli.");
		} else {
			System.out.println(user.getEmail() + " UYARI! Gecersiz bir email girdiniz.");
		}
		if (user.getFirstName().length() + user.getLastName().length() < 2) {
			System.out.println("UYARI! Isim ve soyisim en az iki karakterden olusmalidir!");
		}

		this.userRepository.add(user);
		this.googleService.loginWithGoogle(user);
	}

	@Override
	public void login(User user) {

		if(user.isVerify() == true)  {
			userRepository.login(user);
			System.out.println("Giris basarili!");
		}else {
			System.out.println("Giris basarisiz!");
		}
	}

	@Override
	public void confirm(User user) {
		if(user.isVerify() == true) {
			userRepository.login(user);
			System.out.println("Dogrulama e-maili gonderildi!");
		}else {
			System.out.println("UYARI! Dogrulama e-maili gonderilemedi. Boyle bir e-posta yok!");
		}
	}

}
