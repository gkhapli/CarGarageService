package com.cargarage.services.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO class for WareHouseLocation Object
 * @author Gaurav Khapli
 *
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class WareHouseLocationDTO {

	private double lat;
	private double longitude;
}
