package com.appliedmed.exercises.palindrome;

public class Palindrome {

    /**
     * Computes if the input word is a palindrome. This should be case
     * insensitive.
     *
     * @param input the input word as a String.
     * @return true if the word is a palindrome
     */
    public static boolean isPalindrome(String input) {
	if (input.length()==0 || input.length()==1) {
	    return true;
	}
	if (Character.toLowerCase(input.charAt(0)) ==
	    Character.toLowerCase(input.charAt(input.length()-1))) {
	    return isPalindrome(input.substring(1, input.length()-1));
	}
        return false;
    }
}
