package edu.wm.werewolf.DAO;

import java.util.ArrayList;
import java.util.List;

import edu.wm.werewolf.exceptions.NoPlayerFoundException;
import edu.wm.werewolf.model.Player;

public class MongoPlayerDAO implements IPlayerDAO {

	@Override
	public void insertPlayer(Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Player> getAllAlive() {
		List<Player> players = new ArrayList<Player>();
		
		Player bob = new Player();
		bob.setUserID("1");
		bob.setWerewolf(true);
		bob.setLat(40.3f);
		bob.setLon(32.5f);
		
		players.add(bob);
		
		return players;
	}

	@Override
	public void setDZead(Player p) {
		// TODO Auto-generated method stub

	}

	@Override
	public Player getPlayerById(String id) throws NoPlayerFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
