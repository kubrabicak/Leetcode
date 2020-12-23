package LeetCode;

import java.util.Scanner;

/* Reverse a string */
public class ReverseString {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String reverse = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.print(reverse);
    }
}
