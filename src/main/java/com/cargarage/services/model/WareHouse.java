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
 * POJO class for WareHouse Object
 * @author Gaurav Khapli
 *
 */
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Document(collection="warehouse")
public class WareHouse {
	
	@Id
	private String id;
	private String name;
	@Field(value = "location")
	private WareHouseLocation location;
	private Cars cars;
	

}
