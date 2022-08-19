package com.aurionpro.model;

public class FILELogger implements ILogger  {
	public void log(String ErrorMessage) {
		System.out.println("Writing in FILELogger...."+ErrorMessage);
	}
}
