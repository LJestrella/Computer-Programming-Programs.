import java.util.*;

public class PasswordCheck {
    public static void main(String pito []) {
        Scanner lj = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = lj.nextLine();

        int score = 0;
        if (pass.matches(".*[A-Z].*")) score++;
        if (pass.matches(".*[a-z].*")) score++;
        if (pass.matches(".*[0-9].*")) score++;
        if (pass.length() >= 8) score++;

        if (score <= 2) {
            System.out.println("WEAK");
        } else if (score == 3) {
            System.out.println("MODERATE");
        } else {
            System.out.println("STRONG");
      }
   }
}