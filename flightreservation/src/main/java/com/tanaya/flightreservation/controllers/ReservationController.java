package com.tanaya.flightreservation.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tanaya.flightreservation.entities.Flight;
import com.tanaya.flightreservation.repos.FlightRepository;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId, 
			ModelMap modelMap){
		
		Optional<Flight> flight = flightRepository.findById(flightId);
		modelMap.addAttribute("flight", flight);
		return "completeReservation";
		
	}

}
