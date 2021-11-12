package com.littleCoders.ChallengeEpic.repository;

import com.littleCoders.ChallengeEpic.model.ChallengeSolved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeSolvedRepository extends JpaRepository<ChallengeSolved, Integer> {
}
