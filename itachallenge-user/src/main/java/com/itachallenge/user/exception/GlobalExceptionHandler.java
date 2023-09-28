package com.itachallenge.user.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserScoreNotFoundException.class)
    public ResponseEntity<ErrorMessage> notFoundResponse(UserScoreNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ErrorMessage(ex.getMessage()));
    }

    @AllArgsConstructor
    @Getter
    static
    class ErrorMessage {
        String msg;
    }
}