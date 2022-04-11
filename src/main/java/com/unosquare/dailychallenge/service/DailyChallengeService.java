package com.unosquare.dailychallenge.service;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DailyChallengeService {

    private final String STRING_REQUIRED="A string is needed to evaluate";

    /** Counting vowels and consonants: Write a program that counts the number
     *  of vowels and consonants in a given string. Do this for the English language,
     *  which has five vowels (a, e, i, o, and u)*/
    public String countVowelsAndConstants(String test){
        if(StringUtils.isEmpty(test))
            return STRING_REQUIRED;

        test = unaccent(test).replaceAll("[\\W_]", "");
        int numberOfVowels = test.replaceAll("[^aeiouAEIOU]","").length();
        return String.format("The number of vowels is %d and the number of letters is %d ",numberOfVowels,test.length()-numberOfVowels);
    }

    /**Checking whether a string is a palindrome:
     * Write a program that determines whether the given string is a palindrome or not.*/
    public String isPalindrome(String test) {
        if(StringUtils.isEmpty(test))
            return STRING_REQUIRED;
        test = unaccent(test.toLowerCase());
        String reverseStr = new StringBuilder(test).reverse().toString();
        if(reverseStr.equals(test))
            return "The given string is a palindrome";
        else
            return "The given string is not a palindrome";
    }

    /** Finding the longest common prefix: Write a program that finds the longest common prefix of given strings.*/
    /**
     * This is a personal implementation cause we can use apache commons: StringUtils.getCommonPrefix(test.split(","));
     */
    public String getCommonPrefix(String test) {
        if(StringUtils.isEmpty(test) || test.split(",").length==0)
            return STRING_REQUIRED;
        String[] t= test.split(",");
        String prefix = t[0];
        
        for (int i = 1; i < t.length; i++) {
            while (t[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (StringUtils.isEmpty(prefix))
                    return "";
            }
        }
        return prefix;
    }

    private String unaccent(String src) {
        return Normalizer.normalize(src, Normalizer.Form.NFD)
                         .replaceAll("[^\\p{ASCII}]", "");
    }
}
