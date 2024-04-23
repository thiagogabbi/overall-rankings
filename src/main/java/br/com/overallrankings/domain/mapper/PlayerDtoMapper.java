package br.com.overallrankings.domain.mapper;

import br.com.overallrankings.domain.Player;
import br.com.overallrankings.domain.dto.PlayerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PlayerDtoMapper {

    PlayerDtoMapper INSTANCE = Mappers.getMapper(PlayerDtoMapper.class);


    Player toPlayer(PlayerDTO playerDTO);
    List<Player> toPlayer(List<PlayerDTO> playerDTO);

    @Mapping(target = "rankingId", source = "ranking.id")
    PlayerDTO toPlayerDto(Player player);
    List<PlayerDTO> toPlayerDto(List<Player> player);

}
