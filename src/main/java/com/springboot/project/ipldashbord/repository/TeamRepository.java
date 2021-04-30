package com.springboot.project.ipldashbord.repository;

import com.springboot.project.ipldashbord.model.Team;

import org.springframework.data.repository.CrudRepository;


public interface TeamRepository extends CrudRepository<Team,Long>{
    Team findByTeamName(String teamName);
}
