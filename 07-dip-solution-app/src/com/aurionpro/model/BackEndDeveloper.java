package com.aurionpro.model;

public class BackEndDeveloper implements IDeveloper {

	public void develop() {
		this.writeJava();
	}
	
	public void writeJava() {
		System.out.println("Writes Java Code");
	}
}
