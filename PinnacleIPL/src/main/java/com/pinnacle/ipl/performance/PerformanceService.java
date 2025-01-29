package com.pinnacle.ipl.performance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.ipl.match.Match;
import com.pinnacle.ipl.match.MatchResult;
import com.pinnacle.ipl.player.Player;
import com.pinnacle.ipl.team.Team;

@Service
public class PerformanceService {


	Team team1 = new Team("T1", "CSK", "N Srinivasan");
	Team team2 = new Team("T2", "Mumbai Indians", "Nita Amabani");
	Match match1 = new Match("A1", LocalDate.of(2025, 01, 01), "Wankhede Stadium,Mumbai", team1, team2,
			MatchResult.DRAW);
	Match match2 = new Match("A2", LocalDate.of(2025, 02, 01), "Patel Stadium, Gujrart", team1, team2,
			MatchResult.TEAM1_WON);
	Performance performance1 = new Performance("P1", 100, 20, 5, 4.0, "PL1", match1.getMatchID());
	Performance performance2 = new Performance("P2", 120, 30, 7, 8.0, "PL2", match2.getMatchID());
	Player player = new Player("PL1", "MSD", "INDIAN", "wicket keeper", team1.getTeamID());
	Player player2 = new Player("PL1", "Rashid Khan", "Afghanistan", "batsman", team1.getTeamID());

	private List<Performance> performances = new ArrayList<>(Arrays.asList(performance1, performance2));

	public List<Performance> getAllPerformance() {
		return performances;
	}

	public Performance getPerformance(String id) {
		Performance performance = performances.stream().filter(t -> id.equals(t.getPerformanceID())).findFirst()
				.orElse(null);
		return performance;
	}

	public void addPerformance(Performance performance) {
		performances.add(performance);

	}

	public void updateMatch(Performance performance, String id) {
		for (int i = 0; i < performances.size(); i++) {
			Performance u = performances.get(i);
			if (u.getMatchID().equals(id)) {
				performances.set(i, performance);
				return;
			}
		}
	}

	public void deletePerformance(String id) {
		performances.removeIf(t -> t.getPerformanceID().equals(id));

	}

}
