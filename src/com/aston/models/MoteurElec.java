package com.aston.models;

public class MoteurElec implements Iengine {
	int capacite;

	public MoteurElec(int capacite) {

		this.capacite = capacite;
	}

	public int getCapacite() {
		return this.capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Je demarre" );
	}

	@Override
	public void consommer(int dist) {
		// TODO Auto-generated method stub
		int conso = this.capacite/dist;
		System.out.println("je cosomme " + conso + "Kw/h");
	}

	@Override
	public void arret() {
		// TODO Auto-generated method stub
		System.out.println("Je m' arrete");
	}




}
