package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Reservation;

public interface IReservationRepository {
	
	Reservation getResvation(Long resNo) throws Exception;

	List<Reservation> getResvation() throws Exception;

	int insertRes(Long resNo) throws Exception;

	int updateRes(Long resNo) throws Exception;

	int deleteRes(Long resNo) throws Exception;

}