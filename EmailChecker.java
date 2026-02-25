import java.util.*;

public class EmailChecker {
    public static void main(String pito []) {
        Scanner lj = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = lj.nextLine();

        if (email.contains("@") && email.indexOf(".")!= -1 && !email.startsWith("@") && email.endsWith(".edu")) {
            System.out.println("Email is VALID");
        } else {
            System.out.println("Email is INVALID");
        }
    }
}