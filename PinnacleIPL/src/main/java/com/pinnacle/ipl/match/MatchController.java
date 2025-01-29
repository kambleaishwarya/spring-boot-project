package com.pinnacle.ipl.match;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {
	
	@Autowired
	private MatchService matchService;
	
	@RequestMapping(value = "/match")
	public List<Match> getAllMatch() {
		return matchService.getAllMatch();
	}
	
	@RequestMapping(value = "/match/{id}")
	public Match getMatch(@PathVariable String id) {
		return matchService.getMatch(id);
	}
	
	
	@RequestMapping(value = "/match", method = RequestMethod.POST)
	public void addMatch(@RequestBody Match match) {
		matchService.addMatch(match);
	}
	
	@RequestMapping(value = "/match/{id}", method = RequestMethod.PUT)
	public void updateUser(@RequestBody Match match, @PathVariable String id)
	{
		matchService.updateMatch(match, id);
		
	}
	
	@RequestMapping(value = "/match/{id}", method = RequestMethod.DELETE)
	public void deleteMatch(@PathVariable String id)
	{
		matchService.deleteMatch(id);
	}
	
	
}
