/**
 *   File Name: PetClass.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

/**
 * PetClass //ADDD (description of class)
 *
 * @author Yakovenko, Galina
 */

/*
 * Create the methods makeSound(), eat(), and move() using System.out calls to
 * console.
 */

public class PetClass {
	private double petCosts;
	private char petGender;
	private boolean petHasRabies;
	private String petName;
	private String petType;
	private int petYearBorn;

	// Sets all the defaults
	public PetClass() {
		this.petType = "cat";
		this.petName = "Marquita";
		this.petYearBorn = 2010;
		this.petHasRabies = false;
		this.petCosts = 100;
		this.petGender = 'F';
	}

	// Sets All then reassigns just name based on arg passed
	public PetClass(String petName, int petYearBorn) {
		this();
		setPetName(petName);
		setPetYearBorn(petYearBorn);
	}

	// Sets none of the defaults, gets all from user
	public PetClass(String petType, String petName, int petYearBorn, boolean petHasRabies, double petCosts,
			char petGender) {
		setPetType(petType);
		setPetName(petName);
		setPetYearBorn(petYearBorn);
		setPetHasRabies(petHasRabies);
		setPetGender(petGender);
		setPetCosts(petCosts);
	}

	/*
	 * There are many versions in between. For example: <br> -ask for 1
	 * arguments<br> -call this() for everthing or this(petGender)<br> -override
	 * set for just that arg with setPetName(----)
	 */

	public void eatFood(String food) {
		System.out.println(getPetName() + " is eating " + food);
	}

	public double getPetCosts() {
		return this.petCosts;
	}

	public char getPetGender() {
		return this.petGender;
	}

	public String getPetName() {
		return this.petName;
	}

	public String getPetType() {
		return this.petType;
	}

	public int getPetYearBorn() {
		return this.petYearBorn;
	}

	public boolean isPetHasRabies() {
		return this.petHasRabies;
	}

	public void makeSound(String sound) {
		System.out.println(getPetName() + " says " + sound);
	}

	public void moveAround(String actioning) {
		System.out.println(getPetName() + " is " + actioning);
	}

	public void setPetCosts(double petCosts) {
		this.petCosts = petCosts;
	}

	public void setPetGender(char petGender) {
		this.petGender = petGender;
	}

	public void setPetHasRabies(boolean petHasRabies) {
		this.petHasRabies = petHasRabies;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public void setPetYearBorn(int petYearBorn) {
		this.petYearBorn = petYearBorn;
	}

	@Override
	public String toString() {
		return "PetClass [\n\tPetType: " + this.petType + "\n\tPetName: " + this.petName + "\n\tpetGender: "
				+ this.petGender + "\n\tpetYearBorn: " + this.petYearBorn + "\n\tPet Costs: " + this.petCosts
				+ "\n\tpetHasRabies: " + this.petHasRabies + "]";
	}
}
