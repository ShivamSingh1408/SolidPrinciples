package com.aurionpro.model;

public class Rectangle {
	 int height, width;

	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double calculateArea() {
		return this.height * this.width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
}
