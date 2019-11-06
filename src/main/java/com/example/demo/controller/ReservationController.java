package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	@GetMapping(path = "/reservation")
	public Reservation getRes(@RequestParam(required = true, defaultValue = "1")Long resNo) throws Exception {
		Reservation resolvation = reposiroty.getResvation(resNo);
		return resolvation;
	}
	
	@PostMapping(path="/resorvation")
	public int insertRes (Long resNo) throws Exception{
		return reposiroty.insertRes(resNo);
	}
	
	@PutMapping(path="/resorvation")
	public int updateRes (Long resNo) throws Exception{
		return reposiroty.updateRes(resNo);
	}
	
	@DeleteMapping(path="/resorvation")
	public int daleteRes(Long resNo) throws Exception{
		return reposiroty.deleteRes(resNo);
	}
	
}
