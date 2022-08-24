/** ****************************************************************************
 * Palindrome.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * Manipulation of palindromes and palindrome sentences with recursion
 **************************************************************************** */
package palindrome;

import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(String phrase) {
        //converts everything to lowercase and leaves only letters and numbers in the string
        phrase = phrase.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        //stop condition
        if (phrase.length() < 2) {
            //System.out.println(phrase.length() < 2);
            return true;
            //condition to verify that the first letter is different from the last letter
        } else if (phrase.charAt(0) != phrase.charAt(phrase.length() - 1)) {
            // System.out.println(phrase.charAt(0) != phrase.charAt(phrase.length() - 1));
            return false;
            //if it is the same, the function is called again by comparing the next letter at the beginning and end of the string
        } else {
            // System.out.println(isPalindrome(phrase.substring(1, phrase.length() - 1)));
            return isPalindrome(phrase.substring(1, phrase.length() - 1));
        } // end if/else condition
    } // end isPalindrome method

    public static void main(String[] args) {
        //Take input from the user
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Module 1 Competency Palindrome by Kevin Bell \n");
        System.out.printf("%16s", "Enter a phrase: ");
        String str = computerKeyboardInput.nextLine();   //Input the string
        //Check whether palindrome or not
        if (isPalindrome(str)) {
            //print the clean phrase
            System.out.printf("%16s", "Clean phrase: ");
            System.out.println(str);
            System.out.printf("%16s", "Reverse phrase: ");
            System.out.println(str);
            System.out.println("This IS a palindrome");
        } else {
            //print the clean phrase
            System.out.printf("%16s", "Clean phrase: ");
            System.out.println(str);
            System.out.printf("%16s", "Reverse phrase: ");
            System.out.println(str);
            System.out.println("This is NOT a palindrome");
        } // end if/else condition
    } // end main method
} // end class Palindrome
