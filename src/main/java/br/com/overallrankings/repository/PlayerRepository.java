package br.com.overallrankings.repository;


import br.com.overallrankings.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    public Optional<Player> findByEmail(String email);

}
