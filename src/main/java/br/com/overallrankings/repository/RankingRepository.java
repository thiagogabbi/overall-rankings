package br.com.overallrankings.repository;

import br.com.overallrankings.domain.Ranking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RankingRepository extends JpaRepository<Ranking, Long> {

    public Optional<Ranking> findById(Long id);
}
