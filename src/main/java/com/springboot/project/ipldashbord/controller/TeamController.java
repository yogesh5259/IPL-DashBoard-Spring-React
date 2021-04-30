package com.springboot.project.ipldashbord.controller;

import com.springboot.project.ipldashbord.model.Team;
import com.springboot.project.ipldashbord.repository.TeamRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamRepository teamRepository;

    public TeamController() {
    }

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        return teamRepository.findByTeamName(teamName);
    }

}
