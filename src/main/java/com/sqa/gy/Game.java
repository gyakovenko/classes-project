/**
 *   File Name: Game.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 22, 2017
 *
 */

package com.sqa.gy;

import java.text.*;

/**
 * Game //ADDD (description of class)
 *
 * @author Yakovenko, Galina
 */
public class Game {
	private boolean isVideoGame;

	private int minPlayers;

	private DecimalFormat moneyFormat = new DecimalFormat("$#.##");

	private String name;

	private double price;

	private String type;

	public Game(String name, String type) {
		this();
		this.name = name;
		this.type = type;
	}

	public Game(String name, String type, int minPlayers, boolean isVideoGame, double price) {
		super();
		this.name = name;
		this.type = type;
		this.minPlayers = minPlayers;
		this.isVideoGame = isVideoGame;
		this.price = price;
	}

	Game() {
		this.name = "Unknown";
		this.type = "Unknown";
		this.minPlayers = 1;
		this.isVideoGame = false;
		this.price = -1;
	}

	public void displayIsGameFun(boolean fun) {
		if (fun) {
			System.out.println(this.name + " is a fun game!");
		} else {
			System.out.println(this.name + " is not my favorite.");
		}
	}

	public void displayNumOfPlayersRange(int maxPlayers) {
		System.out.println(this.name + " is for " + this.minPlayers + " to " + maxPlayers + " players.");
	}

	public void displayPriceCategoryofGame() {
		if (this.price == -1) {
			System.out.println("The price of this game is unkown.");
		} else if (this.price == 0) {
			System.out.println("This game is free.");
		} else if (this.price <= 10) {
			System.out.println("This game is fairly cheap.");
		} else if (this.price > 10) {
			System.out.println("This game is pricey.");
		}
	}

	public int getMinPlayers() {
		return this.minPlayers;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public String getType() {
		return this.type;
	}

	public boolean isVideoGame() {
		return this.isVideoGame;
	}

	public void setMinPlayers(int minPlayers) {
		this.minPlayers = minPlayers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setVideoGame(boolean isVideoGame) {
		this.isVideoGame = isVideoGame;
	}

	@Override
	public String toString() {
		String videoGame = "No";
		if (this.isVideoGame == true) {
			videoGame = "Yes";
		}

		String priceAsString = "Unknown";
		if (this.price == 0) {
			priceAsString = "Free";
		} else if (this.price > 0) {
			priceAsString = this.moneyFormat.format(this.price);

		}

		return "Game: " + "\nName: " + this.name + "\nType: " + this.type + "\nMinimum Players Needed: "
				+ this.minPlayers + "\nIs It A Video Game? " + videoGame + "\nPrice: " + priceAsString;
	}
}
