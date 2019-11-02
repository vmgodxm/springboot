package com.example.demo.repository.interfaces;

import com.example.demo.model.Reservation;

public interface IReservationRepository {
	
	String getResvation(Long resNo) throws Exception;

}