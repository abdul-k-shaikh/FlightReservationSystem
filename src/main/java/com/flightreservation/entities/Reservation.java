package com.flightreservation.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Reservation extends AbstractEntity {

	private Boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;
}
