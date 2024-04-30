package br.com.overallrankings.infra;

import br.com.overallrankings.exceptions.DuplicateEmailException;
import br.com.overallrankings.exceptions.DuplicateRankingException;
import br.com.overallrankings.exceptions.RankingNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

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

    @ExceptionHandler(DuplicateRankingException.class)
    private ResponseEntity<String> DuplicateRankingExceptionHandler(DuplicateRankingException ex) {
        ErrorResponse errorResponse = new ErrorResponse("Ranking already exists");
        return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
    }


    public static class ErrorResponse {
        private String message;
        private Date date;

        public ErrorResponse(String message) {
            this.message = message;
            this.date = new Date();
        }
        public String getMessage() {
            return message;
        }

        public Date getDate() {
            return date;
        }

        public void setMessage(String message, Date date) {
            this.message = message;
            this.date = date;
        }
    }
}
