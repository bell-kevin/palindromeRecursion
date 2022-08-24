/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author 4800590195
 */
class ReverseString {

    String reverseString(String input) {

//        String output = "";
//
//        for(int i=input.length()-1; i>=0; i--){
//
//            output += input.charAt(i);
//
//        }
//        return output;
        if (input.length() == 0) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));

    }

}

//  if String == "string" == 5 char length so:
//  input.substring(0,5);
//  but length will be interchangeable
