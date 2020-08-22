package com.bisaha.cbd.controller;

import com.bisaha.cbd.exception.AlreadyExistsException;
import com.bisaha.cbd.exception.InvalidCredentialsException;
import com.bisaha.cbd.model.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {


    @ExceptionHandler(value = { InvalidCredentialsException.class })
    public ResponseEntity commence(InvalidCredentialsException ex ){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new GenericResponse(null,ex.getMessage()));
    }

    @ExceptionHandler(value = { AlreadyExistsException.class })
    public ResponseEntity commence(AlreadyExistsException ex ){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(new GenericResponse(null,ex.getMessage()));
    }
}
