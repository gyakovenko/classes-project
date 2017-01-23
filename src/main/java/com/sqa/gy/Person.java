/**
 *   File Name: Person.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

/**
 * Person //ADDD (description of class)
 *
 * @author Yakovenko, Galina
 */
public class Person {

	private String address;

	private int age;

	private char gender;

	private double hourlyRate;

	private boolean isAwake;

	private String jobTitle;

	private String name;

	/**
	 * @param address
	 * @param age
	 * @param gender
	 * @param hourlyRate
	 * @param isAwake
	 * @param jobTitle
	 * @param name
	 */
	public Person(String address, int age, char gender, double hourlyRate, boolean isAwake, String jobTitle,
			String name) {
		super();
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.hourlyRate = hourlyRate;
		this.isAwake = isAwake;
		this.jobTitle = jobTitle;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Name: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender + "\nAdress: " + this.address
				+ "\nisAwake: " + this.isAwake + "\nJob Title: " + this.jobTitle + "\nHourly Rate: " + this.hourlyRate);
		return sb.toString();
	}
}
