package com.aurionpro.test;

import com.aurionpro.model.IEatable;
import com.aurionpro.model.IWorkable;
import com.aurionpro.model.Manager;
import com.aurionpro.model.Robot;

public class Test {

	public static void main(String[] args) {
		Robot robot = new Robot();
		atTheWorkStation(robot);
		System.out.println("------------------");
		Manager manager = new Manager();
		atTheWorkStation(manager);
		System.out.println("------------------");
		atTheCanteen(manager);
	}

	private static void atTheCanteen(IEatable manager) {
		manager.startEat();
		manager.stopEat();
	}

	private static void atTheWorkStation(IWorkable worker) {
		worker.startWork();
		worker.stopWork();
	}

}
