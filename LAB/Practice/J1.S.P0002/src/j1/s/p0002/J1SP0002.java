package j1.s.p0002;

import java.util.Scanner;

public class J1SP0002 {

    public static void main(String[] args) {

        System.out.println("Enter number of array:   ");
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
                System.out.println("Invalid, only positive integers are accepted!");
            }
        } 
    }

    public static void selSort() {
        int n = checkNum();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkNum();
        }
//        5
//        9 4 7 3 2
//        2 9 4 7 3
//        2 3 9 4 7
//        2 3 4 9 7 
//        2 3 4 7 9
        
        
        // show unsorted array
        System.out.print("Unsorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
         if (i < arr.length - 1) {
                System.out.print(", ");
            }
            
        }   
        System.out.println("]");

        //sort with selection sort
        for (int i = 0; i < arr.length; i++) {

            // Find smallest element in unsorted array
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap the smallest and first element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
            
//            for (int j = i + 1; j < n; j++) {
//                if (arr[j] < arr[i]) {
//                    int swap;
//                    swap = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = swap;
//                }
//                
////                for (int j1 = 0; j1 < n; j1++) {
////                    System.out.print(arr[j1] + ",");
////                }
////                System.out.println("");
//            }
        }
        // show sorted array
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }   System.out.println("]");

    }

}
