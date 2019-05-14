package com.aston.models;

public class MoteurEssence implements Iengine{
	int capacite;

	public MoteurEssence(int capacite) {

		this.capacite = capacite;
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("je demarre");
	}

	@Override
	public void consommer(int dist) {
		// TODO Auto-generated method stub
		int conso = this.capacite/dist;
		System.out.println(" je consomme " + conso + "L");
	}





	@Override
	public void arret() {
		// TODO Auto-generated method stub

	}


}
