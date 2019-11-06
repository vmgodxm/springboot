package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reservation;
import com.example.demo.repository.interfaces.IReservationRepository;

@RestController
public class ReservationController {

	@Autowired
	private IReservationRepository reposiroty;
	
	@GetMapping(path = "/reservation")
	public List<Reservation> getResList() throws Exception {
		return reposiroty.getResvation();
	}
	
	@GetMapping(path = "/reservation/{resNo}")
	public Long getRes(@RequestParam(required = true, defaultValue = "1")Long resNo) throws Exception {
		return reposiroty.getResvation(resNo);
	}
	
	@PostMapping(path="/reservation")
	public int insertRes (Reservation reservation) throws Exception{
		return reposiroty.insertRes(reservation);
	}
	
	@PutMapping(path="/reservation")
	public int updateRes (Long resNo) throws Exception{
		return reposiroty.updateRes(resNo);
	}
	
	@DeleteMapping(path="/reservation/{resNo}")
	public int daleteRes(@PathVariable Long resNo) throws Exception{
		return reposiroty.deleteRes(resNo);
	}
	
}
