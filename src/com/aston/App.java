/**
 *
 */
package com.aston;

import com.aston.models.Car;
import com.aston.models.Iengine;
import com.aston.models.MoteurElec;
import com.aston.models.MoteurEssence;
import com.aston.models.Moto;

/**
 * @author giordani
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iengine m1= new MoteurElec(50);
		Iengine m2 = new MoteurEssence(100);

		Car car1 = new Car("peugeot", "rouge", 40,m1);
		Car car2 = new Car("Toyota", "bleue", 50,m1);

		Moto moto1 = new Moto("Honda", "rouge", 40,m2);
		Moto moto2 = new Moto("Kawasaki", "bleue", 50,m2);

		System.out.println(car1.getBrand());
		System.out.println(car1.getColor());
		System.out.println(car1.getMiles());

		System.out.println(car2.getBrand());
		System.out.println(car2.getColor());
		System.out.println(car2.getMiles());

		System.out.println(moto1.getBrand());
		System.out.println(moto1.getColor());
		System.out.println(moto1.getMiles());

		System.out.println(moto2.getBrand());
		System.out.println(moto2.getColor());
		System.out.println(moto2.getMiles());

		car1.moveForward(111);
		car2.moveForward(325);
		car2.stop();
		car2.stop();

		moto1.moveForward(175);
		moto2.moveForward(365);
		moto1.stop();
		moto2.stop();

		car1.getEngine().consommer(2);
		System.out.println(car2.toString());
	}}




