package com.services;

import java.util.ArrayList;

import javax.ejb.Remote;

import com.entity.Game;

@Remote
public interface GameServerBeanRemote {
	public void addGame(String gameName, int stars);
	public boolean deleteGame(String gameName);
	public int getGamesSize();
	public String getGames();
}
