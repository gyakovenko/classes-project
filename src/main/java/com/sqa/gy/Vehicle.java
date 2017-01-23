/**
 *   File Name: Vehicle.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 23, 2017
 *
 */

package com.sqa.gy;

import com.sqa.gy.helpers.*;

/**
 * Vehicle
 *
 * @author Yakovenko, Galina
 */
public class Vehicle {
	private boolean isHybridOrFullElectric;
	private boolean lightsOn;
	private String make;
	private String model;
	private double mpg;
	private String name;
	private int numOfDoors;

	public Vehicle() {
		this.name = "None";
		this.make = "Unknown";
		this.model = "Unknown";
		this.numOfDoors = 0;
		this.isHybridOrFullElectric = false;
		this.mpg = 0;
		this.lightsOn = false;
	}

	public Vehicle(String make, String model) {
		this();
		this.make = make;
		this.model = model;
	}

	public Vehicle(String make, String model, int numOfDoors, boolean isHybridOrFullElectric, double mpg,
			boolean lightsOn) {
		super();
		this.make = make;
		this.model = model;
		this.numOfDoors = numOfDoors;
		this.isHybridOrFullElectric = isHybridOrFullElectric;
		this.mpg = mpg;
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public double getMpg() {
		return this.mpg;
	}

	public int getNumOfDoors() {
		return this.numOfDoors;
	}

	public boolean isHybridOrFullElectric() {
		return this.isHybridOrFullElectric;
	}

	public void makesNoise(String noise) {
		System.out.println("The car goes " + noise + ".");
	}

	public void nameTheVehicle() {
		this.name = AppBasics.requestUserInfo("What would you like to name your vehicle?");
		System.out.println("Your " + this.make + " " + this.model + " will now be known as " + this.name);
	}

	public void setHybridOrFullElectric(boolean isHybridOrFullElectric) {
		this.isHybridOrFullElectric = isHybridOrFullElectric;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	@Override
	public String toString() {
		return this.make + " " + this.model + ":\n\tNumber of Doors: " + this.numOfDoors
				+ "\n\tHybrid or Fully Electric: " + this.isHybridOrFullElectric + "\n\tMPG: " + this.mpg;
	}

	public void turnsLightsOnOff() {
		if (this.lightsOn == true) {
			this.lightsOn = false;
			System.out.println("The headlights have been turned off.");
		} else {
			this.lightsOn = true;
			System.out.println("The headlights have been turned on.");
		}
	}
}
