package com.littleCoders.ChallengeEpic.exceptionhandler;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExceptionResponse {

    private String message;
    private LocalDateTime dateTime;
}
