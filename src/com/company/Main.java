package com.company;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        String randomText = "some very random text, with different signs. and so on: lalala. or: nanana";
        System.out.println("Original text: " + randomText);

        StringBuilder builder = new StringBuilder();
        boolean dot = true;

        for (int i = 0; i < randomText.length(); i++) {
            char ch = randomText.charAt(i);

            if (ch == '.') {
                dot = true;

            } else if (dot && Character.isAlphabetic(ch)) {
                ch = Character.toUpperCase(ch);
                dot = false;
            }
            builder.append(ch);
        }

        randomText = builder.toString();
        //was not sure if removing of spec symbols needed, but I have done it:
        String noSpCh = randomText.replaceAll("\\pP", "");
        String[] words = noSpCh.split(" ");
        System.out.println("Split text: " + Arrays.toString(words));

        String newText = String.join(" ", words);
        System.out.println("Modified sentence: " + newText);

    }

}

