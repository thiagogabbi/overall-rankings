package br.com.overallrankings.service;

import br.com.overallrankings.domain.Match;
import br.com.overallrankings.domain.dto.MatchCreationDTO;
import br.com.overallrankings.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public MatchCreationDTO createMatch(MatchCreationDTO matchDTO, boolean closed){
        //Todo: Verificar se so player envolvido já não estão em uma partida
        //Todo: Verificar se o ranking da partida é o mesmo do player
        //Todo: No final vai ter que chamar o serviço de cálculo da pontuação e de rating dos players envolvidos que devem ser atualizados e retornar numa dto
        Optional<Match> existentMatch = matchRepository.findById(matchDTO.getId());


        return null;
    }
}
