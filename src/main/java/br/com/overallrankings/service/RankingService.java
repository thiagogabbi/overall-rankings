package br.com.overallrankings.service;
import br.com.overallrankings.domain.Ranking;
import br.com.overallrankings.domain.dto.RankingDTO;
import br.com.overallrankings.domain.mapper.RankingDtoMapper;
import br.com.overallrankings.exceptions.DuplicateRankingException;
import br.com.overallrankings.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RankingService {

    @Autowired
    private RankingRepository rankingRepository;

    public RankingDTO createRanking(RankingDTO rankingDTO){

        Optional<Ranking> rankingOptional = rankingRepository.findByName(rankingDTO.getName());

        if(rankingOptional.isPresent()) {
            throw new DuplicateRankingException();
        } else {
            Ranking ranking = Ranking.builder().name(rankingDTO.getName()).build();
            ranking = rankingRepository.save(ranking);
            return RankingDtoMapper.INSTANCE.toRankingDTO(ranking);
        }
    }

}
