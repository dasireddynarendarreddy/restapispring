package com.nt.service;

import java.util.List;

import com.nt.repositries.CartData;

public interface ICartService {
	
	public boolean addItem(CartData cd);
	public List<CartData> getData();

}
