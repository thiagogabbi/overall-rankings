package br.com.overallrankings.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @PostMapping("/create")
    public String createPlayer() {
        return "Player created";
    }

    @PutMapping("/update")
    public String updatePlayer() {
        return "Player updated";
    }

    @DeleteMapping("/delete")
    public String deletePlayer() {
        return "Player deleted";
    }

}
