package com.cargarage.services.dto;

import com.cargarage.services.model.Cars;
import com.cargarage.services.model.WareHouseLocation;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO class for WareHouse Object
 * @author Gaurav Khapli
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class WareHouseDTO {

	private String id;
	private String name;
	private WareHouseLocation wareHouseLocation;
	private Cars cars;
}
