package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String text = in.nextLine().toLowerCase();

        // First step: convert the string to a string array
        String []arr = text.split(" ");

        String firstWord = arr[0];
        String secondWord = arr[1];

        System.out.print("First two words: " + firstWord + " " + secondWord);
    }
}

