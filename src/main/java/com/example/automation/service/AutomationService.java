package com.example.automation.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class AutomationService {

    @Scheduled(fixedRate = 10000)
    public void scheduledTask() {
        System.out.println("Scheduled task executed at: " + LocalDateTime.now());
    }

    public String runAutomationManually() {
        String message = "Automation job executed at: " + LocalDateTime.now();
        System.out.println(message);
        return message;
    }
}
