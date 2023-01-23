package eTicaretSistemi.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretSistemi.dataAccess.abstracts.UserRepository;
import eTicaretSistemi.entities.concretes.User;

public class HibernateUserRepository implements UserRepository {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici veritabanina eklendi!");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici veritabanindan silindi!");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli kullanici guncellendi!");
	}

	@Override
	public List<User> getAll() {

		return null;
	}

	@Override
	public void login(User user) {

	}

}
