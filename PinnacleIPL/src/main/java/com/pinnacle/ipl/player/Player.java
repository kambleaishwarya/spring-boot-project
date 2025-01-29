package com.pinnacle.ipl.player;

public class Player {

	private String playerID;
	private String playerName;
	private String nationality;
	private String role;
	private String teamID;

	public Player(String playerID, String playerName, String nationality, String role, String teamID) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.nationality = nationality;
		this.role = role;
		this.teamID = teamID;
	}

	public String getPlayerID() {
		return playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getTeamID() {
		return teamID;
	}

	public void setTeamID(String teamID) {
		this.teamID = teamID;
	}

}
