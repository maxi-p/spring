package dev.maxpetrushin.web.rest.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(UnknownMoneyException.class)
    public ResponseEntity<ErrorDetailsREST> handleUnknownMoneyException(UnknownMoneyException ex) {
        ErrorDetailsREST error = new ErrorDetailsREST();
        error.setMessage("Unknown money exception");
        return ResponseEntity
                .badRequest()
                .body(error);
    }

}
