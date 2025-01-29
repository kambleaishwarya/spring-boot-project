package com.pinnacle.social.post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.pinnacle.social.location.Location;
import com.pinnacle.social.user.User;

@Service
public class PostService {
	
	User user1 = new User(

			"c1", "Hitesh", "Roy", new Location("#1", "Panaji"), "hitesh123@gmail.com");

	User user2 = new User("d1", "alisha", "sharma", new Location("#2", "tamilnadu"), "ali67@gmail.com");

	Post post1 = new Post("e1", "24/12/2024", user1, "Hello, guys have a wonderful day");

	Post post2 = new Post("f1", "31/12/2024", user2, "How are you doing guys? have a wonderful year.");
	
	Post post3 = new Post("f2", "01/012/2025", user2, "Hello guys.. How are you doing..? wish you a happy new year.");

	Post post4 = new Post("f3", "02/01/2025", user2, "Hey.. guys. what are you doing? .");


	List<Post> posts = new ArrayList<>(Arrays.asList(post1, post2, post3,post4));
	
	public List<Post> getAllPost()
	{
		return posts;
	}
	
	public Post getPost(String id) {
    	Post post = posts.stream()
		.filter(t -> id.equals(t.getId()))
		.findFirst()
		.orElse(null);
		
	return post;
}

	public void addPost(Post post) {
     posts.add(post);		
	}

	
	public void updatePost(Post post, String id) {
	      for(int i =0; i < posts.size(); i++)	{	
	    	  Post p = posts.get(i);
	      
	    	  if (p.equals(post)) {
	    		  posts.set(i, post);
	    	  }
	      }
		}
	

	public void deletePost(String id) {
		posts.removeIf(t -> t.getId().equals(id));
	}

	
}
