package com.cargarage.services.dto;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO class for Vehicle Object
 * @author Gaurav Khapli
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class VehicleDTO {
	private String id;
	private String make;
	private String model;
	private Long yearModel;
	private Double price;
	private boolean licensed;
	private LocalDate dateAdded;
	private String location;
	private String warehouse;
}
