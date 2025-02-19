package com.devops.devopsproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class PalindromeController {
    @GetMapping("/checkpalindrome/{input}")
    public Map<String, Object> Greeting(@PathVariable("input") String input){
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
        String reversed=new StringBuilder(cleanedInput).reverse().toString();
        boolean isPalindrome = cleanedInput.equals(reversed);
        Map<String, Object> response = new HashMap<>();
        response.put("input", input);
        response.put("isPalindrome", isPalindrome);
        return response;

    }
}
