package com.springboot.project.ipldashbord.repository;

import java.util.List;

import com.springboot.project.ipldashbord.model.Match;

import org.springframework.data.repository.CrudRepository;

public interface MatchRepository extends CrudRepository<Match,Long> {
    List<Match> getByTeam1orTeam2(String teamName1,String teamName2);
}
