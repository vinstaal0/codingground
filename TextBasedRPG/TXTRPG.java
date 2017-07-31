import java.util.*;

public class TXTRPG {
    
    public static Scanner in = new Scanner(System.in);
    public static String input = "";
    
    public static boolean _continue = true;

    public static void main(String []args) {
        
        while(_continue) {
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Shutting down system...");
                intput = "closed";
            } else {
                System.out.println("Ey!");
                input = in.nextLine();
            }
        }
        
    }
}
