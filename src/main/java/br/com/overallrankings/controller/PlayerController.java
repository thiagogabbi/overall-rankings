package br.com.overallrankings.controller;
import br.com.overallrankings.domain.Player;
import br.com.overallrankings.domain.dto.PlayerDTO;
import br.com.overallrankings.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.core.RepositoryCreationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired PlayerService playerService;

    @PostMapping("/create")
    public ResponseEntity createPlayer(@RequestBody PlayerDTO playerDTO)  throws RepositoryCreationException {
        PlayerDTO newPlayer = playerService.createPlayer(playerDTO);
        return new ResponseEntity(newPlayer, HttpStatus.CREATED);
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
