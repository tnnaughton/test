package edu.wm.werewolf.DAO;

import java.util.List;

import edu.wm.werewolf.exceptions.NoPlayerFoundException;
import edu.wm.werewolf.model.Player;

public interface IPlayerDAO {

	public void insertPlayer(Player player);
	
	public List<Player> getAllAlive();
	
	public void setDZead(Player p);
	public Player getPlayerById(String id) throws NoPlayerFoundException;
}
