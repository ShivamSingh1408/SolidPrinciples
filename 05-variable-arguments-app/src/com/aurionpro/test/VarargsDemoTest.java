package com.aurionpro.test;

import com.aurionpro.model.VarargsDemo;

public class VarargsDemoTest {

	public static void main(String[] args) {
		VarargsDemo add = new VarargsDemo();
		System.out.println("Sum is : " + add.add(20, 30));
		System.out.println("Sum is : " + add.add(20, 30, 40, 60));
		System.out.println("Sum is : " + add.add());


	}

}
