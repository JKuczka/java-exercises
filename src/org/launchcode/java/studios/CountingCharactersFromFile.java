package org.launchcode.java.studios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountingCharactersFromFile {
    public static void main(String[] args) throws IOException {
        // take in string from file at given location
        String fromFile = new String(Files.readAllBytes(Paths.get("/home/riz0/code/java-exercises/src/org/launchcode/java/studios/WarAndPeace.txt")));

        // make fromFile lowercase
        String textLowerCase = fromFile.toLowerCase();

        // setup for counting
        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] textArray = textLowerCase.toCharArray();

        // count characters
        for (char c : textArray) {
            if (Character.isLetter(c)) {                        // check if alpha
                if (charCounts.containsKey(c)) {                // check if character has already been counted
                    charCounts.put(c, charCounts.get(c) + 1);   // count up
                } else {                                        // if char not already present
                    charCounts.put(c, 1);                       // add first occurrence of char
                }
            }
        }
        for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {         // go through the map
            System.out.println(charCount.getKey() + " (" + charCount.getValue() + ")"); // print results
        }
    }
}
