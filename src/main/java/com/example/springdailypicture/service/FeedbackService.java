package com.example.springdailypicture.service;

import com.example.springdailypicture.model.Feedback;
import com.example.springdailypicture.repository.IFeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class FeedbackService implements IFeedbackService {
    @Autowired
    private IFeedbackRepo feedbackRepository;

    @Override
    public List<Feedback> getFeedbackForToday() {
        return feedbackRepository.findByDate(LocalDate.now());
    }

    @Override
    public void saveFeedback(Feedback feedback) {
        feedback.setDate(LocalDate.now());
        feedbackRepository.save(feedback);
    }
}
