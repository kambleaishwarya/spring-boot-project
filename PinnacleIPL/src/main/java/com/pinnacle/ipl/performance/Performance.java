package com.pinnacle.ipl.performance;

public class Performance {

	private String performanceID;
	private Integer runs;
	private Integer balls;
	private Integer wickets;
	private Double overs;
	private String playerID;
	private String matchID;

	public Performance(String performanceID, Integer runs, Integer balls, Integer wickets, Double overs,
			String playerID, String matchID) {
		super();
		this.performanceID = performanceID;
		this.runs = runs;
		this.balls = balls;
		this.wickets = wickets;
		this.overs = overs;
		this.playerID = playerID;
		this.matchID = matchID;
	}

	public String getPerformanceID() {
		return performanceID;
	}

	public void setPerformanceID(String performanceID) {
		this.performanceID = performanceID;
	}

	public Integer getRuns() {
		return runs;
	}

	public void setRuns(Integer runs) {
		this.runs = runs;
	}

	public Integer getBalls() {
		return balls;
	}

	public void setBalls(Integer balls) {
		this.balls = balls;
	}

	public Integer getWickets() {
		return wickets;
	}

	public void setWickets(Integer wickets) {
		this.wickets = wickets;
	}

	public Double getOvers() {
		return overs;
	}

	public void setOvers(Double overs) {
		this.overs = overs;
	}

	public String getPlayerID() {
		return playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}

	public String getMatchID() {
		return matchID;
	}

	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}

}
