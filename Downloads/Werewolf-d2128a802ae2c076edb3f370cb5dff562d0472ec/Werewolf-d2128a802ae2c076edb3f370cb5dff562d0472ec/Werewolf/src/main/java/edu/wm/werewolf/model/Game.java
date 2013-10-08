package edu.wm.werewolf.model;

import java.util.Date;

public class Game {
	private Date createdDate;
	private int dayNightFreq;
	//private List<String> enrolledPlayerIds;
	public Game(Date createdDate, int dayNightFreq) {
		super();
		this.createdDate = createdDate;
		this.dayNightFreq = dayNightFreq;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getDayNightFreq() {
		return dayNightFreq;
	}
	public void setDayNightFreq(int dayNightFreq) {
		this.dayNightFreq = dayNightFreq;
	}
	
	public boolean isNight() {
		return true;
	}
	
}
