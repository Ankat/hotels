package com.pivotal.enablement;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {

	@Id
	private Integer id;
	
	private String hotelName;
	
	public Integer getId() {
		return id;
	}
	public String getHotelName() {
		return hotelName;
	}
	
	public Hotel(Integer id, String hotelName) {
		super();
		this.id = id;
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelName="
				+ hotelName + "]";
	}
	public Hotel() {

	}


}
