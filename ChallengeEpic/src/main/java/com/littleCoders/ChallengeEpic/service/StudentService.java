package com.littleCoders.ChallengeEpic.service;

import com.littleCoders.ChallengeEpic.model.Challenge;
import com.littleCoders.ChallengeEpic.model.ChallengeSolved;

import java.util.List;

public interface StudentService {
    List<Challenge> getAllChallenges();

    List<ChallengeSolved> getAllSolvedChallenges();
}
