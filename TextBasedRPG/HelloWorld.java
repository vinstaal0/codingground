import java.util.*;

public class HelloWorld {
    
    public static Scanner in = new Scanner(System.in);
    public static String input = "";
    
    public static boolean continue = true;

    public static void main(String []args) {
        
        input = in.nextLine();
        
        while(continue) {
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Shutting down system...");
            } else {
                System.out.println("Ey!");
            }
        }
        
    }
}