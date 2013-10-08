package edu.wm.werewolf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.wm.werewolf.DAO.IPlayerDAO;
import edu.wm.werewolf.DAO.IUserDAO;

public class GameService {

private static final Logger logger = LoggerFactory.getLogger(GameService.class);

@Autowired private IPlayerDAO playerDao;
@Autowired private IUserDAO userDao;

public void restartGame()
{
logger.info("Game is restarting");

playerDao.dropAllPlayers();

List<MyUser> users = userDao.getAllUsers();
List<Player> players = new ArrayList<>();

for(MyUser u : users)
{
Player p = new Player();
p.setUserId(u.getId());
playerDao.insertPlayer(p);
players.add(p);
}

Collections.shuffle(players, newRandom(System.currentTimeMillis()));

int werewolfindex = (int)(players.size() * .30f);
}

public List<Player> getAllAlive()
{
return playerDao.getAllAlive();
}


