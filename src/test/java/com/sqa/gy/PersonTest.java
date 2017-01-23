/**
 *   File Name: PersonTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 21, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
 *
 * @author Yakovenko, Galina
 */
public class PersonTest {

	@Test
	public void test() {
		Person person1 = new Person("Oakland", 29, 'O', 50, true, "SQA ENG", "Galina");
		System.out.println(person1);
	}

}
