package com.littleCoders.ChallengeEpic.repository;

import com.littleCoders.ChallengeEpic.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
