package br.com.overallrankings.service;

import br.com.overallrankings.domain.Player;
import br.com.overallrankings.domain.Ranking;
import br.com.overallrankings.domain.dto.PlayerDTO;
import br.com.overallrankings.domain.mapper.PlayerDtoMapper;
import br.com.overallrankings.exceptions.DuplicateEmailException;
import br.com.overallrankings.exceptions.RankingNotFoundException;
import br.com.overallrankings.repository.PlayerRepository;
import br.com.overallrankings.repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private RankingRepository rankingRepository;

    public PlayerDTO createPlayer(PlayerDTO playerDTO) {
        Optional<Ranking> rankingOptional = rankingRepository.findById(playerDTO.getRankingId());

        if (!rankingOptional.isPresent()) {
            throw new RankingNotFoundException();
        } else {

            Optional<Player> existingPlayer = playerRepository.findByEmail(playerDTO.getEmail());

            if (existingPlayer.isPresent() && existingPlayer.get().getRanking().getId() == (playerDTO.getRankingId())) {
                throw new DuplicateEmailException();
            }

            Player player = Player.builder()
                                            .email(playerDTO.getEmail())
                                            .name(playerDTO.getName())
                                            .ranking(rankingOptional.get())
                                            .build();
            player = playerRepository.save(player);

            return PlayerDtoMapper.INSTANCE.toPlayerDto(player);
        }
    }

}
