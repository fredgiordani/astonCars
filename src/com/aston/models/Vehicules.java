package com.aston.models;

public abstract class Vehicules {

	private String brand;
	private String color;
	protected double miles;
	private int nbrWheels;
	private Iengine engine;


	public Vehicules(String brand, String color, double miles, int nbrWheels, Iengine engine) {
		super();
		this.brand = brand;
		this.color = color;
		this.miles = miles;
		this.nbrWheels = nbrWheels;
		this.engine= engine;
	}

	public Iengine getEngine() {
		return this.engine;
	}

	public void setEngine(Iengine engine) {
		this.engine = engine;
	}

	public void setNbrWheels(int nbrWheels) {
		this.nbrWheels = nbrWheels;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getMiles() {
		return this.miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}

	public int getNbrWheels() {
		return this.nbrWheels;
	}


}
