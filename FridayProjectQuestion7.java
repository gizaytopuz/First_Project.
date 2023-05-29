package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sentence:");
        String text = input.nextLine();

        String[] words=text.split(" ");

        System.out.println(words.length);
    }
}


