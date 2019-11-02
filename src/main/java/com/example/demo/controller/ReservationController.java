package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Reservation;
import com.example.demo.repository.interfaces.IReservationRepository;

@RestController
public class ReservationController {

	@Autowired
	private IReservationRepository reposiroty;
	
	@GetMapping(path = "reservation")
	public String getRes(@RequestParam(required = true, defaultValue = "1")Long resNo, Model model) throws Exception {
		Reservation reservation = reposiroty.getRes(resNo);
		model.addAttribute("reservation", reservation);
		return "reservation";
	}
}
