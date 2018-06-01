package com.iheartradio.Repository;

import org.springframework.data.repository.CrudRepository;

import com.iheartradio.model.Station;

public interface StationRepository extends CrudRepository<Station, String> {

}
