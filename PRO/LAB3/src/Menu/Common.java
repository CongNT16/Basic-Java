package Menu;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Common {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static int InputInt(String message) {
        int m;

        while (true) {
            try {
                System.out.print(message);
                m = Integer.parseInt(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Error ~ Again men! ");
            }
        }
        return m;
    }
    
    public static double InputDouble(String message) {
        int n;

        while (true) {
            try {
                System.out.print(message);
                n = Integer.parseInt(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Error ~ Again men! ");
            }
        }
        return n;
    }

    // Double Function
    public static String InputString(String message2) {
        String k;
        
        while (true) {
            try {
                System.out.print(message2);
                k = in.readLine();
                break;
            } catch (Exception e) {
                System.out.println("Error ~ Again men! ");
            }
        }
        return k;
        
    }
    
}