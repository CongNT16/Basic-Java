
package bubble.sort;

import java.util.Scanner;


public class BubbleSort {

     public static void main(String[] args) {

        System.out.println("Enter number of arry:   ");
        selSort();

    }

    public static int checkNum() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                        return n;

            } catch (NumberFormatException e) {
                System.out.println("Enter a positive decimal number.");
            }
        } 
    }

    public static void selSort() {
        int n = checkNum();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = checkNum();
        }
        // show the array just entered
       System.out.print("Unsorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        //sort with intermediate variable
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
            

        
        // show sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
