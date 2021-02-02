package com.cargarage.services.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO class for Vehicle Object
 * @author Gaurav Khapli
 *
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection = "vehicle")
public class Vehicle {

	@Id
	private String id;
	private String make;
	private String model;
	@Field(value = "year_model")
	private Long yearModel;
	private Double price;
	private boolean licensed;
	@Field(value = "date_added")
	private String dateAdded;
}
