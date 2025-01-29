package com.pinnacle.ipl.team;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	private TeamService teamService;

	@RequestMapping(value = "/team")
	public List<Team> getAllMatch() {
		return teamService.getAllTeams();
	}
	
	@RequestMapping(value = "/team/{id}")
	public Team getTeam(@PathVariable String id) {
		return teamService.getTeam(id);
	}
	
	
	@RequestMapping(value = "/team", method = RequestMethod.POST)
	public void addTeam(@RequestBody Team team) {
		teamService.addTeam(team);
	}
	
	@RequestMapping(value = "/team/{id}", method = RequestMethod.PUT)
	public void updateTeam(@RequestBody Team team, @PathVariable String id)
	{
		teamService.updateTeam(team, id);
		
	}
	
	@RequestMapping(value = "/team/{id}", method = RequestMethod.DELETE)
	public void deleteTeam(@PathVariable String id)
	{
		teamService.deleteTeam(id);
	}

}
