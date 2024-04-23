package br.com.overallrankings.exceptions;

public class DuplicateRankingException extends RuntimeException {

    public DuplicateRankingException() {
        super("Ranking already exists");
    }
}
