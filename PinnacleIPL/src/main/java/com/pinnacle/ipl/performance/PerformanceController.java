package com.pinnacle.ipl.performance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PerformanceController {
	
	@Autowired
	private PerformanceService performanceService;
	
	
	@RequestMapping(value= "/performance")
	public List<Performance> getAllPerformance()
	{
		return performanceService.getAllPerformance();
			
	}
	
	@RequestMapping(value = "/performance/{id}")
	public Performance getPerformance(@PathVariable String id) {
		return performanceService.getPerformance(id);
	}
	
	@RequestMapping(value = "/performance", method = RequestMethod.POST)
	public void addPerformance(@RequestBody Performance performance)
	{
		performanceService.addPerformance(performance);
	}
	
	
	@RequestMapping(value = "/performance/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Performance performance, @PathVariable String id)
	{
		performanceService.updateMatch(performance, id);
		
	}
	
	@RequestMapping(value = "/performance/{id}", method = RequestMethod.DELETE)
	public void deleteMatch(@PathVariable String id)
	{
		performanceService.deletePerformance(id);
	}
	

}
	
	
	
	


