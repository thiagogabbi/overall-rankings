package br.com.overallrankings.repository;

import br.com.overallrankings.domain.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long>{
}
