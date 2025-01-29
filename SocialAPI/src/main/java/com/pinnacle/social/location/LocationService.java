package com.pinnacle.social.location;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	
	Location  location = new Location("we2", "Kolkata");
	Location  location2 = new Location("YU4", "Jaipur");
	Location  location3 = new Location("UI8", "Goa");
	Location  location4 = new Location("PO9", "Jharkhand");
	Location  location5 = new Location("P10", "Bihar");

	
	private List<Location> locations = Arrays.asList(location, location2, location3, location4, location5);
	
	public List<Location> getAllLocation()
	{
		return locations;

	
}
	public Location getLocation(String id) {
	    Location location = locations.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
			
	    return location;
	}
	
	public void addLocation(Location location) {
       locations.add(location);		
	}

	public void deleteLocation(String id) {
	  locations.removeIf(t -> t.getId().equals(id));
		
	}
	
	
	public void updateLocation(Location location, String id) {
		
		for(int i = 0; i < locations.size(); i++)
		{
			Location l = locations.get(i);
		
		
			if (l.getId().equals(id)) {
			    locations.set(i, location);
			}
	}
	}
}
	
	


