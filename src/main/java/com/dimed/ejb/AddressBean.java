package com.dimed.ejb;

import javax.ejb.Stateless;

import com.dimed.bd.AddressBD;
import com.dimed.entity.Address;
import com.dimed.infra.AppRN;

/**
 * Session Bean implementation cilass AddressBean
 */
@Stateless
public class AddressBean extends AppRN<Address, Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private AddressBD addressBD;

	public AddressBean() {
		setBD(addressBD);
	}
	
	@Inject
	public void setBD(AddressBD bd) {
		super.setBD(bd);
	}
	
	@Override
	public Address save(Address entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}
	

//	@SuppressWarnings("unchecked")
//	public List<Address> listAddress() {
//		Query query = em.createNamedQuery("address.list");
//		address = query.getResultList();
//		return address;
//	}
//
//	public Address find(Address address) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
