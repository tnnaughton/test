package edu.wm.werewolf.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.wm.werewolf.model.Player;
import edu.wm.werewolf.model.MyUser;

public class UserService implements IUserService {
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired private IUserDAO userDao;

	@Override
	public UserDetails loadUserbyUsername(String name) throws UsernameNotFoundException {

	MyUser u = userDao.getUserByName(name);

	logger.info("Got: "+u);

	if(u==null)
	throw new UsernameNotFound Exception;

	return u;
	}

	@Override
	public void createUser(String username, String password, String firstname, String lastname)
	{
	Collection<GrantedAuthority> authorities = new ArrayList<>();

	authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

	MyUser u = new MyUser(firstname, lastname, username, password, "user.png", authorities);

	userDao.createUser(u);
	}

	@Override
	public void removeUser(){
	}
	
}
