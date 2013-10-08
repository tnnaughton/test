package edu.wm.werewolf.service;

public interface IUserService {
	public UserDetails loadUserbyUsername(String name);
	public void createUser(String username, String password, String firstname, String lastname);
	public void removeUser();
}
