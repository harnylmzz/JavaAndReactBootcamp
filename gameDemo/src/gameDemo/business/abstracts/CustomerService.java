package gameDemo.business.abstracts;

import gameDemo.entitiy.Customer;

public interface CustomerService {
	void add(Customer customer);
	
	void delete(Customer customer);
	
	void update(Customer customer);

}
