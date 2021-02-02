package com.cargarage.services.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO class for Cars Object
 * @author Gaurav Khapli
 *
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection="cars")
public class Cars {
	
	private String location;
	private List<Vehicle> vehicles;

}
