package com.pinnacle.ipl.match;

import java.time.LocalDate;

import com.pinnacle.ipl.team.Team;

public class Match {
	
	private String matchID;
	private LocalDate date;
	private String venue;
	private Team team1; 
	private Team  team2; 
	private MatchResult result;
	
	
	
	
	public Match(String matchID, LocalDate date, String venue, Team team1, Team team2, MatchResult result) {
		super();
		this.matchID = matchID;
		this.date = date;
		this.venue = venue;
		this.team1 = team1;
		this.team2 = team2;
		this.result = result;
	}
	
	
	public String getMatchID() {
		return matchID;
	}
	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public MatchResult getResult() {
		return result;
	}
	public void setResult(MatchResult result) {
		this.result = result;
	}
	
}
