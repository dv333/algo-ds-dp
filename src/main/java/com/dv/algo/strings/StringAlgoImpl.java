package com.dv.algo.strings;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by dvijayan on 10/14/19.
 */
public class StringAlgoImpl {


    /**
     *  This program will print the duplicates in a given input string
     */
    public static  Map<Character, Integer>  printDuplicateCharactersInAString(final String input){

        Map<Character, Integer> charCountMap= null;
        if(input !=null && input.length() > 0)
        {
            if(input.length() ==1){
                return charCountMap;
            }
            charCountMap = new LinkedHashMap<Character, Integer>();
            String inputString = input;
            // In case if the program need not consider capital and small letters,
            // if want to consider comment out below line
            inputString = inputString.toLowerCase();
            char [] inputChars = inputString.toCharArray();

            for(Character c : inputChars) {

                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        else{
            throw new IllegalArgumentException("Invalid input");
        }

        return charCountMap;
    }
}
