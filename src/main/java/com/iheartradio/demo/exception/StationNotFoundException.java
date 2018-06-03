package com.iheartradio.demo.exception;

public class StationNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2063838398919528694L;

	public StationNotFoundException(String exception) {
		super(exception);
	}
}
