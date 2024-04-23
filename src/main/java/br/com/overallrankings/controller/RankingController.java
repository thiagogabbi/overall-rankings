package br.com.overallrankings.controller;


import br.com.overallrankings.domain.dto.RankingDTO;
import br.com.overallrankings.service.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.RepositoryCreationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ranking")
public class RankingController {

    @Autowired
    RankingService rankingService;

    @PostMapping("/create")
    public ResponseEntity createRanking(@RequestBody RankingDTO rankingDTO) throws RepositoryCreationException {
        RankingDTO newRanking = rankingService.createRanking(rankingDTO);
        return new ResponseEntity<>(newRanking, HttpStatus.CREATED);
    }
}
