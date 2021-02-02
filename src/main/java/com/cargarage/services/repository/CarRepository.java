package com.cargarage.services.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cargarage.services.model.WareHouse;

public interface CarRepository extends MongoRepository<WareHouse, Integer>{

	public List<WareHouse> findAll();
}
