package ea.java.dao;

import java.util.Vector;

import ea.java.model.Player;

public class PlayerDAO
{
	private static PlayerDAO instance = null;
	private Vector<Player> players;

	private PlayerDAO()
	{
		players = new Vector<Player>();
		players.add(new Player(1, "ION", 10, 1));
	}

	public static PlayerDAO getInstance()
	{
		if (instance == null)
		{
			instance = new PlayerDAO();
		}
		return instance;
	}

	public Player createPlayer(Player p)
	{
		players.add(p);
		return p;
	}

	public Player getPlayerById(int id)
	{
		for (Player p : players)
		{
			if (p.getPlayerId() == id)
			{
				return p;
			}
		}
		return null;
	}

	public Vector<Player> getPlayers()
	{
		return players;
	}
}
