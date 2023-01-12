package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * I could further improve the readability by using Parameterized tests,
 * but this will do just fine for this exercise.
 * **/
public class LetterCombinationsTest {

    @Test
    public void testLetterCombinations_withDigits23() {
        LetterCombinations letterCombinations = new LetterCombinations();

        List<String> result = letterCombinations.letterCombinations("23");
        assertEquals(Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"), result);
    }

    @Test
    public void testLetterCombinations_withEmptyDigits() {
        LetterCombinations letterCombinations = new LetterCombinations();

        List<String> result = letterCombinations.letterCombinations("");
        assertEquals(Arrays.asList(), result);
    }

    @Test
    public void testLetterCombinations_withDigit2() {
        LetterCombinations letterCombinations = new LetterCombinations();

        List<String> result = letterCombinations.letterCombinations("2");
        assertEquals(Arrays.asList("a","b","c"), result);
    }
}