package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a text string: ");
        String text = in.nextLine();
        String textLowerCase = text.toLowerCase(); //make all lowercase

        HashMap<Character, Integer> charCounts = new HashMap<>();
        char[] textArray = textLowerCase.toCharArray();

        for (char c : textArray) {
            if (Character.isLetter(c)) {            //Check if alpha
                if (charCounts.containsKey(c)) {
                    charCounts.put(c, charCounts.get(c) + 1);
                } else {
                    charCounts.put(c, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> charCount : charCounts.entrySet()) {
            System.out.println(charCount.getKey() + " (" + charCount.getValue() + ")");
        }
    }
}
