package com.iheartradio.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iheartradio.demo.Repository.StationRepository;
import com.iheartradio.demo.exception.StationNotFoundException;
import com.iheartradio.demo.model.Station;

@RestController
public class StationController {
	
	@Autowired
	private StationRepository stationRepository;
	
	@GetMapping("/stations")
	public List<Station> retrieveAllStations() {
		return (List<Station>) stationRepository.findAll();
	}
	
	@GetMapping("/stations/id/{id}")
	public Station retrieveStationById(@PathVariable long id) {
			Optional<Station> station = stationRepository.findById(id);
			
			if(!station.isPresent()) {
				throw new StationNotFoundException("id" +id);
			}
			
			return station.get();
	}
	
	@GetMapping("/stations/name/{name}")
	public Station retrieveStationByName(@PathVariable String name) {
			Optional<Station> station = stationRepository.findByName(name);
			
			if(!station.isPresent()) {
				throw new StationNotFoundException("name" +name);
			}
			
			return station.get();
	}
	
	@GetMapping("/stations/hdenabled/{hdEnabled}")
	public List<Station> retrieveStationByName(@PathVariable boolean hdEnabled) {
			List<Station> station = stationRepository.findByHdEnabled(hdEnabled);
			
			return station;
	}
	
	
	
	@DeleteMapping("/stations/{id}")
	public void deleteById(@PathVariable long id) {
			stationRepository.deleteById(id);
	}
	
	@PostMapping("/stations")
	public void updateStation(@RequestBody Station station) {
		Station savedStation = stationRepository.save(station);
	}
	
	
	
}
