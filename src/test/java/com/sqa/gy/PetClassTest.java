/**
 *   File Name: PetClassTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

/**
 * PetClassTest
 *
 * @author Yakovenko, Galina
 */
public class PetClassTest {

	@Test
	public void test() {
		PetClass[] allPets = new PetClass[2];

		String[] petNames = { "Marquita", "Jimmy" };
		int[] petYearBorn = { 2005, 2001 };

		String[] foods = { "catfood", "dog treats" };
		String[] actioning = { "purring", "playing fetch" };
		String[] sounds = { "meow", "arf!" };

		for (int i = 0; i < allPets.length; i++) {
			allPets[i] = new PetClass(petNames[i], petYearBorn[i]);
			System.out.println(allPets[i]);
			allPets[i].eatFood(foods[i]);
			allPets[i].makeSound(sounds[i]);
			allPets[i].moveAround(actioning[i]);
			System.out.println("\n");
		}
	}
}
