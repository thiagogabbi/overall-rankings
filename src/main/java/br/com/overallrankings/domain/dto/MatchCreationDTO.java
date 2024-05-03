package br.com.overallrankings.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MatchCreationDTO {
    private Long rankingId;
    private List<Long> participants;
    private LocalDateTime matchDateTime;
}
