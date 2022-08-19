package com.aurionpro.model;

public interface IWorker {
	public void startWork();
	public void stopWork();
	public void startEat() throws InterruptedException;
	public void stopEat() throws Exception;
}
