package com.hairgram.repository.interfaces;

import com.hairgram.model.Reservation;

public interface IReservationRepository {
	
	Reservation getResvation(Long resNo) throws Exception;

}