package com.aurionpro.model;

public class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
	}

	public void setHeight(int height) {
		super.setHeight(height); 
		super.setWidth(height);
		
	}

	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width); 
	}

	@Override
	public String toString() {
		return "Square [height=" + height + ", width=" + width + ", getHeight()=" + getHeight() + ", getWidth()="
				+ getWidth() + ", calculateArea()=" + calculateArea() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
