package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repositries.CartData;
import com.nt.service.ICartService;

import io.micrometer.common.lang.NonNull;



public class Runner implements CommandLineRunner {
	@Autowired
	private ICartService ics;

	@Override
	public void run(String... args) throws Exception {
		
		CartData c=new CartData();
		c.setId("12345");
		c.setTitle("cococola");
		c.setDescription("a nice drink for summer");
		c.setCategory("drinks");
		c.setRating("4.5");
		
		boolean val=ics.addItem(c);
		System.out.println("THE DATA WAS"+val);
		
		
	}

}
