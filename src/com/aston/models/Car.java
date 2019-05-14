package com.aston.models;

public class Car extends Vehicules implements Imove {





	public Car(String brand, String color, double miles, Iengine engine) {
		super(brand, color, miles,4 , engine);


	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [toString()=");
		builder.append(super.toString());
		builder.append(", getBrand()=");
		builder.append(this.getBrand());
		builder.append(", getColor()=");
		builder.append(this.getColor());
		builder.append(", getMiles()=");
		builder.append(this.getMiles());
		builder.append(", getClass()=");
		builder.append(this.getClass());
		builder.append(", hashCode()=");
		builder.append(this.hashCode());
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void moveForward(int dist) {
		// TODO Auto-generated method stub
		this.miles += dist;
		System.out.println("la voiture à parcouru " + this.miles );
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("la voiture s'arrete");
	}




}
