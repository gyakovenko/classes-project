/**
 *   File Name: GameTest.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 22, 2017
 *
 */

package com.sqa.gy;

import org.junit.*;

/**
 * GameTest
 *
 * @author Yakovenko, Galina
 *
 */
public class GameTest {

	@Test
	public void test() {
		Game[] threeGamesArray = new Game[3];

		threeGamesArray[0] = new Game("Donkey Kong Country", "Platforming Video Game", 1, true, 24.99);
		threeGamesArray[1] = new Game("Uno", "Card Game");
		threeGamesArray[2] = new Game();

		for (int i = 0; i < threeGamesArray.length; i++) {
			System.out.println(threeGamesArray[i] + "\n");
			threeGamesArray[i].displayNumOfPlayersRange(i + 2);
			threeGamesArray[i].displayIsGameFun(true);
			threeGamesArray[i].displayPriceCategoryofGame();
			System.out.println("\n\n");
		}
		System.exit(0);
	}

}
