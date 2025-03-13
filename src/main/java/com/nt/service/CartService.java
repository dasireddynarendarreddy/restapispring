package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repositries.CartData;
import com.nt.repositries.ICartData;

@Service
public class CartService implements ICartService {
	
	@Autowired
	private ICartData cartdata;
	
	public boolean addItem(CartData cd)
	{
		
		Optional<CartData> obj=Optional.of(cartdata.save(cd));
		return obj.isEmpty()?false:true;
		
	}

	
	public List<CartData> getData() {
		List<CartData> l=cartdata.findAll();
		return l;
	}

}
