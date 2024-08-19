package com.example.springdailypicture.controller;


import com.example.springdailypicture.model.Feedback;
import com.example.springdailypicture.service.IFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private IFeedbackService feedbackService;

    @GetMapping("/daily-pic")
    public String index(Model model) {
        List<Feedback> feedbacks = feedbackService.getFeedbackForToday();
        model.addAttribute("feedbacks", feedbacks);
        return "/index";
    }

    @PostMapping("/submitFeedback")
    public String submitFeedback(@ModelAttribute Feedback feedback) {
        feedbackService.saveFeedback(feedback);
        return "redirect:/daily-pic";
    }

}
