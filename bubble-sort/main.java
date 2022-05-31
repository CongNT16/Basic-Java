

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number of array:   ");
        bubSort();

    }

    public static int checkNum() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());

                        return n;

            } catch (NumberFormatException e) {
                System.out.println("Invalid, only positive integers are accepted!");
            }
        } 
    }

    public static void bubSort() {
        int n = checkNum();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        
        int min, max;
        do{
        System.out.println("Enter the min and max of the array.");
        System.out.print("Min: ");
        min = checkNum();
        System.out.print("Max: ");
        max = checkNum();}
        while(min>max);
        
        
        Random ran = new Random();

        for (int i =0;i<arr.length;i++) {
            arr[i] = ran.nextInt(max + 1 - min) + min;
        }
        
        // show unsorted array
        System.out.print("Unsorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
         if (i < arr.length - 1) {
                System.out.print(", ");
            }
            
        }   
        System.out.println("]");

        //sort with bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
           

        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }   System.out.println("]");

    }

}
