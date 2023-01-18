package gameDemo.business.concretes;

import gameDemo.business.abstracts.CustomerService;
import gameDemo.entitiy.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println( customer.getUserName() + " isimli kullanici basari ile eklendi!");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println( customer.getUserName() + " isimli kullanici basari ile silindi!");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println( customer.getUserName() + " isimli kullanici basari ile guncellendi!");
		
	}

	}

	


