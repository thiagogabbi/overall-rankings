package br.com.overallrankings.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {

        private Long id;

        private String name;

        private String email;

        private Long rankingId;

        private Double rating;

        private Integer totalPoints;
}
