package com.pinnacle.ipl.player;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlayerController {

	private PlayerService playerService;

	@RequestMapping(value = "/player")
	public List<Player> getAllPlayer() {
		return playerService.getAllPlayer();
	}

	@RequestMapping(value = "/player/{id}")
	public Player getPlayer(@PathVariable String id) {
		return playerService.getPlayer(id);
	}

	@RequestMapping(value = "/player", method = RequestMethod.POST)
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);

	}

	@RequestMapping(value = "/player/{id}", method = RequestMethod.PUT)
	public void updateUser(@RequestBody Player player, @PathVariable String id) {
		playerService.updatePlayer(player, id);

	}

	@RequestMapping(value = "/player/{id}", method = RequestMethod.DELETE)
	public void deletePlayer(@PathVariable String id) {
		playerService.deletePlayer(id);
	}

}
