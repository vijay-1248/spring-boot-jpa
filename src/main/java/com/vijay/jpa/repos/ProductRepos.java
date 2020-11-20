package com.vijay.jpa.repos;

import org.springframework.data.repository.CrudRepository;

import com.vijay.jpa.entity.Product;

public interface ProductRepos extends CrudRepository<Product,Integer> {

}
