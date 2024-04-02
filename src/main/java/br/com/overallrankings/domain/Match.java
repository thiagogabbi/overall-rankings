package br.com.overallrankings.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "is_finished")
    private boolean isFinished;

    @ManyToOne
    @JoinColumn(name = "ranking_id")
    private Ranking ranking;

    @OneToMany(mappedBy = "match")
    private List<MatchParticipation> MatchParticipationList;

    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;
}
