package com.aurionpro.model;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Manager is Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager had stopped Working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager is Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager had stopped Eating");
	}

}
