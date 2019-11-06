package com.example.demo.repository.interfaces;

import java.util.List;

import com.example.demo.model.Reservation;

public interface IReservationRepository {
	
	List<Reservation> getResvation() throws Exception;

	Long getResvation(Long resNo) throws Exception;

	int updateRes(Long resNo) throws Exception;

	int deleteRes(Long resNo) throws Exception;

	int insertRes(Reservation reservation) throws Exception;


}