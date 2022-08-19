package com.aurionpro.model;

public class TaxCalculator {
	LogType logger;
	
	public TaxCalculator(LogType logger) {
		this.logger = logger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax = amount/rate;

		} catch(Exception e) {
			if(logger==(LogType.DB)) {
				new DBLogger().log("An Error Occured"+e.getMessage());
			}else if(logger==(LogType.FILE)) {
				new FILELogger().log("An Error Occured"+e.getMessage());
			}
		}
		return tax;
	}

}
