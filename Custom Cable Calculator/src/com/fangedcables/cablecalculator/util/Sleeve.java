package com.fangedcables.cablecalculator.util;

public class Sleeve {

	private float price = 0.29f;
	private float DEFAULT_LENGTH = 1.0f;
	private String DEFAULT_COLOR = "White";
	private float DEFAULT_DIAMETER = 5f;

	private float length;
	private String color;
	private float diameter;

	public Sleeve() {
		this.length = DEFAULT_LENGTH;
		this.color = DEFAULT_COLOR;
		this.diameter = DEFAULT_DIAMETER;
	}

	public Sleeve(float length, String color, float diameter) {
		this.length = length;
		this.color = color;
		this.diameter = diameter;
	}

	public float getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}

	public float getLength() {
		return this.length;
	}

	public float getDiameter() {
		return this.diameter;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	
}
