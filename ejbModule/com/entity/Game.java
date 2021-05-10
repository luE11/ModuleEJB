package com.entity;

public class Game {
	private String gameName;
	private int stars;
	
	public Game(String gameName, int stars) {
		this.gameName = gameName;
		this.stars = stars;
	}

	public String getGameName() {
		return gameName;
	}

	public int getStars() {
		return stars;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	
	
}
