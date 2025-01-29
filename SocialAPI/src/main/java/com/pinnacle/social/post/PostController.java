package com.pinnacle.social.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
	
	@Autowired
	private PostService postService;
	

	
	@RequestMapping(value="/posts")
	public List<Post> getAllPost(){

	return postService.getAllPost();
	
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
	public Post getPost(@PathVariable String id) {
	    return postService.getPost( id);
	}
	
	@RequestMapping(value = "/posts", method = RequestMethod.POST)
	public void addPost(@RequestBody Post post) {
	     postService.addPost(post);
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.PUT)
	public void updatePost(@RequestBody Post post, @PathVariable String id ) {
		postService.updatePost(post, id);
	}
	
	@RequestMapping(value = "/posts/{id}", method = RequestMethod.DELETE)
	public void deletePost(@PathVariable String id) {
		postService.deletePost(id);
		
	}
}
