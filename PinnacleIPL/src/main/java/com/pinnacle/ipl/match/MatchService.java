package com.pinnacle.ipl.match;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.team.Team;

@Service
public class MatchService {
	
	Team team1 = new Team("T1", "CSK" , "N Srinivasan");
	Team team2 = new Team("T2", "Mumbai Indians" , "Nita Amabani");
	Match match1 = new Match ("A1", LocalDate.of(2025, 01, 01), "Wankhede Stadium,Mumbai", team1, team2, MatchResult.DRAW);
	Match match2 = new Match ("A2", LocalDate.of(2025, 02, 01), "Patel Stadium, Gujrart", team1, team2, MatchResult.TEAM1_WON);

private List<Match>	matches = new ArrayList<>(Arrays.asList(match1, match2));
	

	public List<Match> getAllMatch() {
		return matches;
	}

	public Match getMatch(String id) {
		Match match = matches.stream()
				.filter(t -> id.equals(t.getMatchID()))
            .findFirst()
            .orElse(null);
		return match;
	}

	public void addMatch(Match match) {
		matches.add(match);
	}

	public void updateMatch(Match match, String id) {
		for(int i=0; i< matches.size(); i++) {		
	    	   Match u = matches.get(i);
	    	   if(u.getMatchID().equals(id)) {
	    		   matches.set(i, match);
	    		   return;
	}
		}
	}

	public void deleteMatch(String id) {
		matches.removeIf(t -> t.getMatchID().equals(id));
		
	}
	
	

}
