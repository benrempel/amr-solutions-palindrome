/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appliedmed.exercises.palindrome;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author zmichaels
 */
public class TestPalindrome {

    @Test
    public void testPass() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testFail() {
        assertFalse(Palindrome.isPalindrome("aabbccdd"));
    }

    @Test
    public void testCaseInsensitive() {
        assertTrue(Palindrome.isPalindrome("Anna"));
    }
}
