package com.iheartradio.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Station {
	
	@Id
	@GeneratedValue
	private long stationId;
	private String name;
	private boolean hdEnabled;
	private String callSign;
	
	public Station() {
		super();
	}
	
	public Station(long stationId, String name, boolean hdEnabled, String callSign) {
		super();
		this.stationId = stationId;
		this.name = name;
		this.hdEnabled = hdEnabled;
		this.callSign = callSign;
	}
	
	public long getStationId() {
		return stationId;
	}
	public void setStationId(long stationId) {
		this.stationId = stationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHdEnabled() {
		return hdEnabled;
	}
	public void setHdEnabled(boolean hdEnabled) {
		this.hdEnabled = hdEnabled;
	}
	public String getCallSign() {
		return callSign;
	}
	public void setCallSign(String callSign) {
		this.callSign = callSign;
	}
	
	

}
