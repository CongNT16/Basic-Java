package j1.s.p0003;

import java.util.Scanner;

public class J1SP0003 {

    public static void main(String[] args) {

        System.out.println("Enter number of arry:   ");
        insSort();
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

    public static void insSort() {
        int n = checkNum();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = checkNum();
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

        //sort with insertion variable
        for (int i = 0; i < n; i++) {

            int ins = arr[i];
            int j = i - 1;

            while (j >= 0 && ins < arr[j]) {
                arr[j + 1] = arr[j];
                j  = j - 1;
            }
            arr[j + 1] = ins;

        }
        
//        5
//        9 3 5 2 6
//        3 9 5 2 6
//        3 5 9 2 6
//        2 3 5 9 6 
//        2 3 5 6 9
        
        // show sorted array
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
