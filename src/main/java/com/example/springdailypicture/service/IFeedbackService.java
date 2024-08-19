package com.example.springdailypicture.service;

import com.example.springdailypicture.model.Feedback;

import java.util.List;

public interface IFeedbackService {
    List<Feedback> getFeedbackForToday();

    void saveFeedback(Feedback feedback);
}
