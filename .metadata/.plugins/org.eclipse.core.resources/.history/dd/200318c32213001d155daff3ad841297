package com.aurionpro.model;

public class TaxCalculator {
	ILogger logger;
	
	public TaxCalculator(ILogger logger) {
		this.logger = logger;
	}
	
	public int calculateTax(int amount, int rate) {
		int tax=0;
		try {
			tax = amount/rate;

		} catch(Exception e) {
			logger.log("An Erroe Occured");
		}
		return tax;
	}

}
