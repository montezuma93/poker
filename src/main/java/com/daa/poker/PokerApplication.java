package com.daa.poker;

import com.daa.poker.controller.GameController;
import com.daa.poker.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class PokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokerApplication.class, args);
	}

}
