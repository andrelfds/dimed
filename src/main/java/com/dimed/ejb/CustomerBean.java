package com.dimed.ejb;

import java.util.List;

import javax.ejb.Stateless;

import com.dimed.bd.CustomerBD;
import com.dimed.entity.Customer;
import com.dimed.infra.AppRN;

/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
public class CustomerBean extends AppRN<Customer, Long> {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CustomerBD customerBD;

	public CustomerBean() {
		setBD(customerBD);
	}
	
	@Inject
	public void setBD(CustomerBD bd) {
		super.setBD(bd);
	}
	
	public List<Customer> listCustomer() {
		return customerBD.listCustomer();
	}
	
}
