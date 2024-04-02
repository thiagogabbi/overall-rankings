package br.com.overallrankings.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String email;

    @ManyToOne
    @JoinColumn(name = "ranking_id")
    private Ranking ranking;

    @OneToMany(mappedBy = "player")
    private List<MatchParticipation> matchParticipationList;

    private Double rating;

    private Integer totalPoints;
}
