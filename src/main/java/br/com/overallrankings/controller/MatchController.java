package br.com.overallrankings.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @PostMapping("/create")
    // Esse método vai criar uma partida, mas ela pode ser criada já fechada ou aberta.
    // Abaixo, vou criar um método para fechar a partida
    public String createMatch() {
        return "Match created";
    }

    @PutMapping("/close")
    public String closeMatch() {
        return "Match closed";
    }

    @PutMapping("/invalidate")
    public String invalidateMatch() {
        return "Match Invalidated";
    }

}
