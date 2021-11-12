package com.littleCoders.ChallengeEpic.repository;

import com.littleCoders.ChallengeEpic.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Integer> {
}
