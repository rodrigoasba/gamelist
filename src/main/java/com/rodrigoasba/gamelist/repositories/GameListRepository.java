package com.rodrigoasba.gamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoasba.gamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
