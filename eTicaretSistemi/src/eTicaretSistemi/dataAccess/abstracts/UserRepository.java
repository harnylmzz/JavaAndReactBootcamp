package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.User;

public interface UserRepository {

	public void add(User user);
	public void login(User user);
	public void delete(User user);
	public void update(User user);
		
	List<User> getAll();
	
}
