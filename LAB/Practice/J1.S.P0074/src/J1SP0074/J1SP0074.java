    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1SP0074;

import java.util.Scanner;

public class J1SP0074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //control   
        //Dilsplay menu
        displayMenu();
        //Allow user select option
        int option = selectOption(1, 4);
        switch (option) {
            case 1://If user select option 1 then allow addition Matrix
                MatrixManager.additionMatrix();
                break;
            case 2://If user select option 2 then allow subtraction Matrix
                MatrixManager.subtractionMatrix();
                break;
            case 3://If user select option 3 then allow multiplication Matrix
                MatrixManager.multiplicationMatrix();
                break;
            case 4://If user select option 4 then exit
                break;

        }
    }

    //menu
    public static void displayMenu() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }

    //select
    public static int selectOption(int min, int max) {
        // loop unitl user input valid
        while (true) {
            try {
                Scanner scan = new Scanner(System.in);
                String stringoption = scan.nextLine();
                if (stringoption.isEmpty() == true) {
                    System.out.println("Option can not be empty.Please enter again.");
                } else {
                    int option = Integer.parseInt(stringoption);
                    //check user input in range allow or not
                    if (option >= min && option <= max) {
                        return option;

                    } else {
                        System.out.println("Your option input must be in range "
                                    + min + " to " + max + " .Please enter again.");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.Please enter number from "
                            + min + " to " + max + " .");
            }
        }
    }
}
