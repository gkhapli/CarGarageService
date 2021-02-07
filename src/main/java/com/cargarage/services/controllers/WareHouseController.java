package com.cargarage.services.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cargarage.services.aspects.Loggable;
import com.cargarage.services.dto.VehicleDTO;
import com.cargarage.services.service.CarService;

/**
 * @author Gaurav Khapli
 * This class is the Controller class which will have all the API's for interacting with the MongoDb.
 */
@RestController
public class WareHouseController {

	@Autowired
	private CarService carService;
    
	/**
	 * API for Get all the Car details
	 * @return dto object of Car Object
	 */
	
	@CrossOrigin
	@Loggable
	@GetMapping(value = "/cars")
    public ResponseEntity<List<VehicleDTO>> getCars() {
		List<VehicleDTO> vehicleList = carService.getCars();
		if(!vehicleList.isEmpty()) {
			return new ResponseEntity<List<VehicleDTO>>(vehicleList, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<VehicleDTO>>(vehicleList,HttpStatus.NO_CONTENT);
		}
    }

}
