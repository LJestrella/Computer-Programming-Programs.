import java.util.*;

public class UsernameValidator {
    public static void main(String pito []) {
        Scanner lj = new Scanner(System.in);

        System.out.print("Enter username: ");
        String usern = lj.nextLine();

        if (usern.length() <= 8 && !usern.contains(" ") && Character.isLetter(usern.charAt(0))) {
            System.out.println("Username is VALID");
        } else {
            System.out.println("Username is INVALID");
        }

    }
}