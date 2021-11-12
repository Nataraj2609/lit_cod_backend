package com.littleCoders.ChallengeEpic.controller;

import com.littleCoders.ChallengeEpic.model.Challenge;
import com.littleCoders.ChallengeEpic.model.ChallengeSolved;
import com.littleCoders.ChallengeEpic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public String getM() {
        return "I am the Student!";
    }

    @GetMapping("/getChallenges")
    public List<Challenge> getAllChallenge() {
        return studentService.getAllChallenges();
    }

    @GetMapping("/getAllSolved")
    public List<ChallengeSolved> getAllSolved() {
        return studentService.getAllSolvedChallenges();
    }
}
