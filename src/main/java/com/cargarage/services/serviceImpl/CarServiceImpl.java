package com.cargarage.services.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargarage.services.dto.CarDTO;
import com.cargarage.services.dto.VehicleDTO;
import com.cargarage.services.model.Cars;
import com.cargarage.services.model.Vehicle;
import com.cargarage.services.model.WareHouse;
import com.cargarage.services.repository.CarRepository;
import com.cargarage.services.service.CarService;

@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;

	/**
	 * Service Class for getting the Cars detail
	 */
	@Override
	public List<VehicleDTO> getCars() {
		List<WareHouse> wareHouses = carRepository.findAll();

		List<VehicleDTO> vehicleDTOs = new ArrayList<VehicleDTO>();
		//Transforming the WareHouse object to DTO class
		for (WareHouse wareHouse : wareHouses) {
			Cars cars = wareHouse.getCars();
			CarDTO carDTO = new CarDTO();
			carDTO.setLocation(cars.getLocation());
			List<Vehicle> vehicles = cars.getVehicles();
			//Transforming the Vehicle list to DTO list
			for (Vehicle vehicle : vehicles) {
				VehicleDTO vehicleDTO = new VehicleDTO();
				vehicleDTO.setId(vehicle.getId());
				vehicleDTO.setMake(vehicle.getMake());
				vehicleDTO.setModel(vehicle.getModel());
				vehicleDTO.setPrice(vehicle.getPrice());
				vehicleDTO.setYearModel(vehicle.getYearModel());
				//Parsing the String Date to LocalDate
				vehicleDTO.setDateAdded(LocalDate.parse(vehicle.getDateAdded()));
				vehicleDTO.setLicensed(vehicle.isLicensed());
				vehicleDTO.setLocation(cars.getLocation());
				vehicleDTO.setWarehouse(wareHouse.getName());
				vehicleDTOs.add(vehicleDTO);
			}
		}
		
		//Sort the Date based in the ascending order
		Collections.sort(vehicleDTOs, (date1, date2) -> date1.getDateAdded().compareTo(date2.getDateAdded()));

		return vehicleDTOs;
	}

}
