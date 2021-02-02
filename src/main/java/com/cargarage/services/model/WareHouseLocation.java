package com.cargarage.services.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO class for WareHouseLocation Object
 * @author Gaurav Khapli
 *
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection="location")
public class WareHouseLocation {

	private double lat;
	private double longitude;
	
}
