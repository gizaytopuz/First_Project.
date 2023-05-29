package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Insert sentence");
        String sentence = scanner.next().toLowerCase();
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'A' || sentence.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("Number of A = " + counter);
    }
}

