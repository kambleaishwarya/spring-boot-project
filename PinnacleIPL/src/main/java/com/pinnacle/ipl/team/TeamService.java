package com.pinnacle.ipl.team;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TeamService {

    Team team1 = new Team("T1", "CSK" , "N Srinivasan");
	Team team2 = new Team("T2", "Mumbai Indians" , "Nita Amabani");
    Team team3  = new Team("T3", "Punjab 11" , "pretty zinta");
	Team team4 = new Team("T4", "KKR" , "S Shetty");

    private List<Team>	teams = new ArrayList<>(Arrays.asList(team1, team2, team3, team4));
	

	public List<Team> getAllTeams() {
		return teams;
	}

	public Team getTeam(String id) {
		Team team = teams.stream()
				.filter(t -> id.equals(t.getTeamID()))
            .findFirst()
            .orElse(null);
		return team;
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	public void updateTeam(Team team, String id) {
		for(int i=0; i< teams.size(); i++) {		
	    	   Team u = teams.get(i);
	    	   if(u.getTeamID().equals(id)) {
                teams.set(i, team);
	    		   return;
	}
		}
	}

	public void deleteTeam(String id) {
		teams.removeIf(t -> t.getTeamID().equals(id));
		
	}
	
	

}