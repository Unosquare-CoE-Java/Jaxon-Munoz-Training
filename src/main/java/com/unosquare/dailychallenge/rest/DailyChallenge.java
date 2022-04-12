package com.unosquare.dailychallenge.rest;

import com.unosquare.dailychallenge.service.DailyChallengeService;
import com.unosquare.registration.rest.dtos.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("daily/challenge/")
public class DailyChallenge {

    @Autowired
    private DailyChallengeService dailyChallengeService;

    @GetMapping("1/{test}")
    public ResponseEntity<ResponseDTO<String>> getCountVowelsAndConstants(@PathVariable("test") @Valid final String test) {
        return new ResponseEntity<>(new ResponseDTO<>(Boolean.TRUE,dailyChallengeService.countVowelsAndConstants(test)),HttpStatus.OK);
    }

    @GetMapping("2/{test}")
    public ResponseEntity<ResponseDTO<String>> getIsPalindrome(@PathVariable("test") @Valid final String test) {
        return new ResponseEntity<>(new ResponseDTO<>(Boolean.TRUE,dailyChallengeService.isPalindrome(test)),HttpStatus.OK);
    }

    @GetMapping("3/{test}")
    public ResponseEntity<ResponseDTO<String>> getCommonPrefix(@PathVariable("test") @Valid final String test) {
        return new ResponseEntity<>(new ResponseDTO<>(Boolean.TRUE,dailyChallengeService.getCommonPrefix(test)),HttpStatus.OK);
    }

    @GetMapping("4/{test}")
    public ResponseEntity<ResponseDTO<String>> getWithoutDuplicates(@PathVariable("test") @Valid final String test) {
        return new ResponseEntity<>(new ResponseDTO<>(Boolean.TRUE,dailyChallengeService.removeDuplicates(test)),HttpStatus.OK);
    }
}
