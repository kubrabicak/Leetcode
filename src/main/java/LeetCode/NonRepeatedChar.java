package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

/* Find the first non repeated character in a word */
public class NonRepeatedChar {

    public static void main(String[] args) {
        System.out.println("Enter a word");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char character = nonRepeatedChar(word);
        System.out.println("First non repeated character is: " + character);
    }

    public static char nonRepeatedChar(String word) {
        HashMap<Character, Integer> charList = new HashMap<>();
        int i, length;
        Character c;
        length = word.length();

        for (i = 0; i < length; i++) {
            c = word.charAt(i);
            if (charList.containsKey(c)) {
                charList.put(c, charList.get(c) + 1);
            } else {
                charList.put(c, 1);
            }
        }

        for (i = 0; i < length; i++) {
            c = word.charAt(i);
            if (charList.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined");
    }
}