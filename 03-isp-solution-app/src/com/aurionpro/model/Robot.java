package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robot is Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot had stopped Working");
	}

}
