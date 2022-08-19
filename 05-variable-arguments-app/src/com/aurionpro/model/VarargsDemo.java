package com.aurionpro.model;

public class VarargsDemo {
	public int add(int i, int j) {
		System.out.println("hello");
		return i + j;
	}

	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}
