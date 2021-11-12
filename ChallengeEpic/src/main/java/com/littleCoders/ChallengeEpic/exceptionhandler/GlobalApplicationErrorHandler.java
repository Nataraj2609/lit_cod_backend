package com.littleCoders.ChallengeEpic.exceptionhandler;

import com.littleCoders.ChallengeEpic.exceptionhandler.exception.CategoryNotFoundException;
import com.littleCoders.ChallengeEpic.exceptionhandler.exception.ChallengeNotFoundException;
import com.littleCoders.ChallengeEpic.exceptionhandler.exception.StudentNotFoundException;
import com.littleCoders.ChallengeEpic.exceptionhandler.exception.TeacherNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalApplicationErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(TeacherNotFoundException.class)
    public ResponseEntity<Object> handleExceptions( TeacherNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("Teacher Not found in the database");
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> handleExceptions( StudentNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("Student Not found in the database");
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity<Object> handleExceptions( CategoryNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("Category Not found in the database");
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }

    @ExceptionHandler(ChallengeNotFoundException.class)
    public ResponseEntity<Object> handleExceptions( ChallengeNotFoundException exception, WebRequest webRequest) {
        ExceptionResponse response = new ExceptionResponse();
        response.setDateTime(LocalDateTime.now());
        response.setMessage("Challenge Not found in the database");
        ResponseEntity<Object> entity = new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return entity;
    }
}
