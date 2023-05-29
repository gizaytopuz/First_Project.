package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion6 {
    public class Task06 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter a sentence");
            String text = in.nextLine();

            // First step: convert the string to a string array
            String[] arr = text.split(" ");

            String firstWord = arr[0];
            String lastWord = arr[arr.length - 1];

            System.out.println("First and last words: " + firstWord + " " + lastWord);
        }
    }
}
