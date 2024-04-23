package br.com.overallrankings.exceptions;

public class RankingNotFoundException extends RuntimeException {

    public RankingNotFoundException() {
        super("Ranking not found");
    }

    public RankingNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
