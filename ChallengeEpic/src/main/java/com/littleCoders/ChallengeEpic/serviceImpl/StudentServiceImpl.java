package com.littleCoders.ChallengeEpic.serviceImpl;

import com.littleCoders.ChallengeEpic.model.Challenge;
import com.littleCoders.ChallengeEpic.model.ChallengeSolved;
import com.littleCoders.ChallengeEpic.repository.ChallengeRepository;
import com.littleCoders.ChallengeEpic.repository.ChallengeSolvedRepository;
import com.littleCoders.ChallengeEpic.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    ChallengeRepository challengeRepository;

    @Autowired
    ChallengeSolvedRepository challengeSolvedRepository;

    @Override
    public List<Challenge> getAllChallenges() {
        return challengeRepository.findAll();
    }

    @Override
    public List<ChallengeSolved> getAllSolvedChallenges() {
        List<ChallengeSolved> solved = challengeSolvedRepository.findAll();
        System.out.println(solved);
        return solved;
    }
}
