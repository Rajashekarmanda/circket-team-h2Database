/*
 * 
 * You can use the following import statemets
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */
package com.example.player.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.example.player.service.PlayerH2Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.player.model.Player;

@RestController
class PlayerController {
    @Autowired
    public PlayerH2Service playerService;

    @GetMapping("/players")
    public ArrayList<Player> getBooks() {
        return playerService.getBooks();
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerDetails(@PathVariable int playerId) {
        return playerService.getPlayerDetails(playerId);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")

    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable int playerId) {
        playerService.deletePlayer(playerId);
    }

}