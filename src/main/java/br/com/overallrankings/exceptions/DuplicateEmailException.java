package br.com.overallrankings.exceptions;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException() {
        super("Email already exists in this ranking");
    }

    public DuplicateEmailException(String message, Throwable cause) {
        super(message, cause);
    }

}
