package com.nt.repositries;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICartData extends MongoRepository<CartData, String> {

}
