package daineka.moneytransferapp.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import daineka.moneytransferapp.exception.InsufficientFunds;
import daineka.moneytransferapp.exception.InvalidCredentials;
import daineka.moneytransferapp.model.ExceptionResponse;

@RestControllerAdvice
public class ExeptionHahdlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<ExceptionResponse> invalidCredentialsHandler(InvalidCredentials e) {
        return new ResponseEntity<>(new ExceptionResponse(e.getMessage(), 400), HttpStatus.valueOf(400));
    }

    @ExceptionHandler(InsufficientFunds.class)
    public ResponseEntity<ExceptionResponse> insufficientFundsHandler(InsufficientFunds e) {
        return new ResponseEntity<>(new ExceptionResponse(e.getMessage(), 500), HttpStatus.valueOf(500));
    }
}
