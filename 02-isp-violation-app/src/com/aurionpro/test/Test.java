package com.aurionpro.test;

import com.aurionpro.model.IWorker;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class Test {

	public static void main(String[] args) throws Exception {
		IWorker manager = new Manager();
		atTheWorkStation(manager);
		System.out.println("----------------------");
		atTheCanteen(manager);
		System.out.println("----------------------");

		IWorker robot = new Robot();
		atTheWorkStation(robot);
		System.out.println("----------------------");
		atTheCanteen(robot);
	}

	private static void atTheCanteen(IWorker worker) throws Exception{
		worker.startEat();
		worker.stopEat();
	}

	private static void atTheWorkStation(IWorker worker) {
		worker.startWork();
		worker.stopWork();
	}

}
