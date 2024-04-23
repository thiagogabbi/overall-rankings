package br.com.overallrankings.domain.mapper;

import br.com.overallrankings.domain.Ranking;
import br.com.overallrankings.domain.dto.RankingDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RankingDtoMapper {

    RankingDtoMapper INSTANCE = Mappers.getMapper(RankingDtoMapper.class);

    Ranking toRanking(RankingDTO rankingDTO);
    List<Ranking> toRanking (List<RankingDTO> rankingDTO);

    RankingDTO toRankingDTO(Ranking ranking);

    List<RankingDTO> toRankingDto(List<Ranking> ranking);
}
