/**
 *   File Name: VehicleTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 23, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

/**
 * VehicleTest
 *
 * @author Yakovenko, Galina
 *
 */
public class VehicleTest {

	@Test
	public void test() {
		Vehicle[] arrayOfThreeVehicles = new Vehicle[3];

		arrayOfThreeVehicles[0] = new Vehicle("Toyota", "Prius", 5, true, 43, false);
		System.out.println(arrayOfThreeVehicles[0].toString());
		System.out.print("\n");
		arrayOfThreeVehicles[0].makesNoise("[silence]");
		arrayOfThreeVehicles[0].turnsLightsOnOff();
		arrayOfThreeVehicles[0].nameTheVehicle();
		System.out.println("\n");

		arrayOfThreeVehicles[1] = new Vehicle("Ford", "Aspire");
		System.out.println(arrayOfThreeVehicles[1].toString());
		System.out.print("\n");
		arrayOfThreeVehicles[1].makesNoise("whirrrrrr");
		arrayOfThreeVehicles[1].turnsLightsOnOff();
		arrayOfThreeVehicles[1].nameTheVehicle();
		System.out.println("\n");

		arrayOfThreeVehicles[2] = new Vehicle();
		System.out.println(arrayOfThreeVehicles[2].toString());
		System.out.print("\n");
		arrayOfThreeVehicles[2].makesNoise("nada");
		arrayOfThreeVehicles[2].turnsLightsOnOff();
		arrayOfThreeVehicles[2].nameTheVehicle();
	}
}
