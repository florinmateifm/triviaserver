package ea.java.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player
{
	private int playerId;
	private String username;
	private int score;
	private int color;

	public Player()
	{
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String username, int score, int color)
	{
		this.playerId = playerId;
		this.username = username;
		this.score = score;
		this.color = color;
	}

	public int getPlayerId()
	{
		return playerId;
	}

	public void setPlayerId(int playerId)
	{
		this.playerId = playerId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public int getScore()
	{
		return score;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public int getColor()
	{
		return color;
	}

	public void setColor(int color)
	{
		this.color = color;
	}
}
