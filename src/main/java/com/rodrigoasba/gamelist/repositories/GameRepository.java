package com.rodrigoasba.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoasba.gamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
