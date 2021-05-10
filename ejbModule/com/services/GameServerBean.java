package com.services;

import java.util.ArrayList;
import java.util.Iterator;

import javax.ejb.Stateless;

import com.entity.Game;

/**
 * Session Bean implementation class GameServerBean
 */
@Stateless
public class GameServerBean implements GameServerBeanRemote {
	private ArrayList<Game> gameList;
	
    /**
     * Default constructor. 
     */
    public GameServerBean() {
       gameList = new ArrayList<Game>();
    }

	@Override
	public void addGame(String gameName, int stars) {
		gameList.add(new Game(gameName, stars));		
	}

	@Override
	public boolean deleteGame(String gameName) {
		boolean deleted = false;
		for (int i = 0; i < gameList.size() && !deleted; i++) {
			if (gameList.get(i).getGameName().compareTo(gameName) == 0) {
				gameList.remove(i);
				deleted = true;
			}
		}
		return deleted;
	}

	@Override
	public int getGamesSize() {
		return gameList.size();
	}

	@Override
	public String getGames() {
		String games = "";
		for (Game game : gameList) {
			games+=game.getGameName()+" Puntuación: "+game.getStars()+"\n";
		}
		return games.substring(0, games.length()-1);
	}

}
