package com.aurionpro.model;

public class DBLogger implements ILogger {
	public void log(String ErrorMessage) {
		System.out.println("Writing in DBLogger ...."+ErrorMessage);
	}
}
