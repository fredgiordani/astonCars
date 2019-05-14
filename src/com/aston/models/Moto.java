package com.aston.models;

public class Moto extends Vehicules implements Imove{

	public Moto(String brand, String color, double miles, Iengine engine) {
		super(brand, color, miles,2,  engine);

	}







	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Moto [miles=");
		builder.append(this.miles);
		builder.append(", getEngine()=");
		builder.append(this.getEngine());
		builder.append(", getBrand()=");
		builder.append(this.getBrand());
		builder.append(", getColor()=");
		builder.append(this.getColor());
		builder.append(", getMiles()=");
		builder.append(this.getMiles());
		builder.append(", getNbrWheels()=");
		builder.append(this.getNbrWheels());
		builder.append(", toString()=");
		builder.append(super.toString());
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
		System.out.println("la moto à parcouru " + this.miles );
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("la moto s'arrete");
	}

}
