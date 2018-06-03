package com.iheartradio.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iheartradio.demo.model.Station;

@Repository
public interface StationRepository extends JpaRepository<Station, Long> {
	
	Optional<Station> findByName(String name);
	
	List<Station> findByHdEnabled(boolean hdEnabled);

}
