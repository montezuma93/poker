package com.daa.poker.controller;

import com.daa.poker.domain.Player;
import com.daa.poker.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpResponse;

@Controller
@RequestMapping("poker")
public class GameController {

    public GameController() {
    }

    @Autowired
    GameService gameService;

    @GetMapping("/getAllPlayers")
    public ResponseEntity<String> getAllPlayers() {
        return new ResponseEntity<String>(gameService.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/addPlayer/{name}")
    public ResponseEntity<Void> addPlayer(@PathVariable String name) {
        gameService.addPlayer(name);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
