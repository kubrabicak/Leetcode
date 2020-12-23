package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

/* Create a phone book and find phone numbers by name */
public class PhoneBook {

    public static void main (String []args) {
        System.out.println("Enter number of entries in your phone book");
        Scanner scan = new Scanner(System.in);
        int numberOfEntries = scan.nextInt();
        scan.nextLine();
        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();

        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Enter a name");
            String name = scan.nextLine();
            System.out.println("Enter a phone number");
            int phoneNumber = scan.nextInt();
            phoneBook.put(name, phoneNumber);
            scan.nextLine();
        }

        while (scan.hasNext()) {
            System.out.println("Enter the name you want to find in the phone book");
            String actionName = scan.nextLine();
            if (phoneBook.containsKey(actionName)){
                System.out.println(actionName + "=" + phoneBook.get(actionName));
            }
            else {
                System.out.println("This name is not found");
            }
        }
        scan.close();
    }
}
