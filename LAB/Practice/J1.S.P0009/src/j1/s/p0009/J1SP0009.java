
package j1.s.p0009;


public class J1SP0009 {

   
    public static void main(String[] args) {
        System.out.println("The 45 sequence finbonacci ");
        for (int i = 0; i < 45; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
     
//    6
//    
//    0 1 1 2 3 5
    
    // find n(th) fibonacci number
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
}
