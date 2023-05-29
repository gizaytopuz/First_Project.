package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two numbers to define your 2D-array");
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Please enter each element of your 2D-array");
        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 222;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }

    }
}