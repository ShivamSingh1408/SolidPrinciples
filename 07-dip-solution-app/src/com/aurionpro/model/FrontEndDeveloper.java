package com.aurionpro.model;

public class FrontEndDeveloper implements IDeveloper {

	public void develop() {
		this.writeJavaScript();
	}
	public void writeJavaScript() {
		System.out.println("Writes JavaScript Code");
	}
}
