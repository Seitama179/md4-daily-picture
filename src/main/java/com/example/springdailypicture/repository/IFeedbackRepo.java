package com.example.springdailypicture.repository;

import com.example.springdailypicture.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IFeedbackRepo extends JpaRepository<Feedback, Integer> {
    List<Feedback> findByDate(LocalDate date);
}
