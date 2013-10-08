package edu.wm.werewolf.model;

public class Player {
	private String id;
	private boolean isDead;
	private double lat;
	private double lon;
	private String userID;
	private boolean isWerewolf;
	public Player(String id, boolean isDead, float lat, 
			float lon, String userID, boolean isWerewolf) {
		super();
		this.id = id;
		this.isDead = isDead;
		this.lat = lat;
		this.lon = lon;
		this.userID = userID;
		this.isWerewolf = isWerewolf;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public boolean isWerewolf() {
		return isWerewolf;
	}
	public void setWerewolf(boolean isWerewolf) {
		this.isWerewolf = isWerewolf;
	}
}
