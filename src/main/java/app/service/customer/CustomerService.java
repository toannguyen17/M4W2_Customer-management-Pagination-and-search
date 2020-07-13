package app.service.customer;

import app.model.Customer;
import app.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
	Page<Customer> findAll(Pageable pageable);
	Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
	Iterable<Customer> findAllByProvince(Province province);
	Iterable<Customer> findAll();
	Customer findById(Long id);
	void save(Customer customer);
	void remove(Long id);
}
