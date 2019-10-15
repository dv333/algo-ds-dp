package com.dv.algo.strings.test;

import java.util.*;

/**
 * Created by dvijayan on 10/14/19.
 */
public class StringAlgoImpl {


    /**
     *  This program will print the duplicates in a given input string
     */
    public static  Map<Character, Integer>  findDuplicateCharactersInAString(final String input){

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

    /**
     * This method will check if two Strings are anagrams
     * If two Strings are anagram, it should be made up of
     *  - same letters by ignoring white space, comma, periods, !
     *  - same size
     *  - ignore capital or small letters
     * @param a
     * @param b
     * @return
     */
    public static boolean checkForAnagram(final String a, final String b) {
        boolean isAnagram = false;

        if(a == null || b == null){
           throw new IllegalArgumentException("Invalid input");
        }
        if(a.length() != b.length()){
            return isAnagram;
        }
        char [] lowerCaseA = a.trim().toLowerCase().toCharArray();
        String upperCaseB= b.trim().toLowerCase();
        boolean check =true;
        for(int i =0; i<lowerCaseA.length ; i++){
            Character c = lowerCaseA[i];
            int n = c;
            if(c >=95 && c <=122){
                if(! upperCaseB.contains(c.toString())){
                    check=false;
                    break;
                }
            }
            else {
                continue;
            }
        }
        if(check){
            isAnagram =true;
        }

        return isAnagram;
    }


    public static char firstNonRepeatedCharacterInString(final String input){
        if(input ==null ){
            throw new IllegalArgumentException("Invalid input");
        }
        if(input.length() ==1){
            return input.charAt(0);
        }
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<Character, Integer>();
        char [] characters = input.toCharArray();
        for(int count = 0 ; count <characters.length ; count++){
            Character  c = characters[count];
            if(characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c, characterIntegerMap.get(c)+1);
            }
            else{
                characterIntegerMap.put(c, 1);
            }
        }
        Optional<Character> optional = characterIntegerMap.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1 )
                .map(Map.Entry :: getKey)
                .findFirst();

        return optional.orElse('0');
    }
}
