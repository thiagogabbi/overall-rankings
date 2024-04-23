package br.com.overallrankings.infra;

import br.com.overallrankings.exceptions.DuplicateEmailException;
import br.com.overallrankings.exceptions.RankingNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RankingNotFoundException.class)
    private ResponseEntity<String> RankingNotFoundExceptionHandler(RankingNotFoundException ex) {
        return new ResponseEntity<>("Ranking not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateEmailException.class)
    private ResponseEntity<String> DuplicateEmailExceptionHandler(DuplicateEmailException ex) {
        return new ResponseEntity<>("Email already exists", HttpStatus.CONFLICT);
    }
}
