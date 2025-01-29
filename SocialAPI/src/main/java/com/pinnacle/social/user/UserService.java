package com.pinnacle.social.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.social.location.Location;

@Service
public class UserService {

	User user = new User("e1", "anjali", "k", new Location("er4", "Bangluru"), "anjali12@faker.com");
	User user2 = new User("pt1", "hina", "patel", new Location("ui24", "jaipur"), "hina12@faker.com");
	User user3 = new User("pt1", "jayesh", "verma", new Location("ui24", "jharkhand"), "jay12@faker.com");
	User user4 = new User("pt1", "avani", "das", new Location("ui24", "bihar"), "avi12@faker.com");
	User user5 = new User("pt1", "mukta", "Tiwari", new Location("ui24", "madhyapradesh"), "mukta12@faker.com");

	private List<User> users = new ArrayList<>(Arrays.asList(user, user2, user3, user4,user5));

	public List<User> getAllUsers() {
		return users;

	}
	
	public User getUser(String id) {
	    User user = users.stream()
			.filter(t -> id.equals(t.getId()))
			.findFirst()
			.orElse(null);
			
	    return user;
	}
	
	public void addUser(User user) {
	    users.add(user);
	}

	public void deleteUser(String id) {
		users.removeIf(t -> t.getId().equals(id));
      		
	}

	public void updateUser(User user6, String id) {
       for(int i=0; i< users.size(); i++) {		
    	   User u = users.get(i);
    	   if(u.getId().equals(id)) {
    		   users.set(i, user);
    		   return;
    	   }
       }
	}
	 

}
