package com.nt.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.repositries.CartData;
import com.nt.service.ICartService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="http://localhost:5173")
public class CartController {
	
	@Autowired
	private ICartService ics;
	
	@PostMapping
	public boolean addData(@RequestBody CartData c)
	{
		System.out.println(c);
		return ics.addItem(c);
	}
	@GetMapping("/data")
	public List<CartData> getItems(@RequestParam(value = "limit", defaultValue = "10") Long limit)
	{
		List<CartData>ls=ics.getData();
		List<CartData> res=ls.stream()
                .limit(limit)  // Limit the stream to 'limit' items
                .collect(Collectors.toList());
		return res;
		
	}
	@GetMapping("/data/{id}")
	public List<CartData> getItem(@PathVariable String id)
	
	{
		System.out.println(id);
		List<CartData> matchingItems =ics.getData().stream()
	            .filter(d -> d.getId().equals(id)) 
	            .collect(Collectors.toList());
		
		return matchingItems;
		
	}
	

}
