
/*
 Define the three Double dimensional with equal size, read an input into first tow
 arrays and store the sum of both array into third array.
*/


package Assignment3;

import java.util.Scanner;

public class threeDoubleDimensionDemo {

    public static void main(String[] args) {

        int arr1[][] = new int[5][5];
        int arr2[][] = new int[5][5];
        int arr3[][] = new int[5][5];


        Scanner scanner = new Scanner(System.in);

        // Entering 5 digits for first 2 dimensional array.
        System.out.println();
        System.out.println(" Enter 9 number for the first 2 dimensional  array.");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                arr1[i][j] = scanner.nextInt();
                System.out.print("Your value in row and column (" + (i + 1) + " , " + (j + 1) + ")  is : " + arr1[i][j] + "\n");
            }

        // Entering 5 digits for 2nd 2 dimensional array.
        System.out.println();
        System.out.println(" Enter 9 number for the 2nd 2 dimensional array.");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = scanner.nextInt();
                System.out.print("Your value in row and column (" + (i + 1) + " , " + (j + 1) + ")  is : " + arr2[i][j] + "\n");
            }

        // Adding the value of both 2 dimensional and display it.
        System.out.println();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];

                System.out.print("Your value in row and column (" + (i + 1) + " , " + (j + 1) + ")  is : " + arr3[i][j] + "\n");
            }

    }

}
