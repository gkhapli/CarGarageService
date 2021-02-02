package com.cargarage.services.dto;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO class for Car Object
 * @author Gaurav Khapli
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CarDTO {
	
	private String location;
	private List<VehicleDTO> vehicleDTOs;
}
