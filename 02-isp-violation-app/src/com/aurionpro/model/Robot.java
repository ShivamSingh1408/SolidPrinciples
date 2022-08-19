package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot is Working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot had stopped Working");

	}

	@Override
	public void startEat() throws InterruptedException {
		System.out.println("Robot can not Eat");
	}

	@Override
	public void stopEat() throws Exception {
			System.out.println("Robot can not start or stop Eating");
		
	}
 
}
