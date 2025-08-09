package com.example.automation.controller;

import com.example.automation.service.AutomationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {

    private final AutomationService automationService;

    public AutomationController(AutomationService automationService) {
        this.automationService = automationService;
    }

    @GetMapping("/run-job")
    public String runJob() {
        return automationService.runAutomationManually();
    }
}
