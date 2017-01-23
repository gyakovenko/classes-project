/**
 *   File Name: Homework7ArrayOfPeople.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 22, 2017
 *
 */

package com.sqa.gy;

/**
 * Homework7ArrayOfPeople
 *
 * @author Yakovenko, Galina
 *
 *         pt3 -Create an array of 5 People objects <br>
 *         Display all details of those 5 People objects.
 */
public class Homework7ArrayOfPeople {

	public static void main(String[] args) {
		Person[] arrayOfFivePeople = new Person[5];

		arrayOfFivePeople[0] = new Person("Oakland", 29, 'F', 35, true, "QA Engineer", "Galina");
		arrayOfFivePeople[1] = new Person("Oakland", 29, 'M', 45, true, "Electrician", "Robert");
		arrayOfFivePeople[2] = new Person("Belmont", 53, 'F', 25, true, "QA Engineer", "Galina");
		arrayOfFivePeople[3] = new Person("San Francisco", 27, 'F', 27, true, "QA Engineer", "Tanya");
		arrayOfFivePeople[4] = new Person("Belmont", 60, 'M', 18, true, "Machine Operator", "Yury");

		for (int i = 0; i < arrayOfFivePeople.length; i++) {
			System.out.println(arrayOfFivePeople[i] + "\n");
		}
		System.exit(0);
	}
}
