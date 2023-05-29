package Week5FridayQuestions;

import java.util.Scanner;

public class FridayProjectQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] arr = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[] arr2 = new int[x];

        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr[i].length; j++) {
                prod = prod * arr[i][j];
                arr2[i] = prod;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
            {


            }
        }
    }
}