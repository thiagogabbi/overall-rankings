package br.com.overallrankings.controller;

import br.com.overallrankings.domain.dto.MatchCreationDTO;
import br.com.overallrankings.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/create")
    public ResponseEntity createMatch(@RequestBody MatchCreationDTO matchCreationDTO, @RequestParam(required = false) boolean closed) {
        MatchCreationDTO newMatch = matchService.createMatch(matchCreationDTO, closed);
        return new ResponseEntity(newMatch, HttpStatus.CREATED);
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
