import java.util.*;

class Positive {
    public static void main (String pito[]) {
      Scanner lj = new Scanner(System.in);


       System.out.print("Enter a number: ");
        int num = lj.nextInt();


       if (num > 0) {
        System.out.println("The number is a positive number.");
}   else if (num <= 0) {
         System.out.println("The number is not a positive number.");
      } else {
          System.out.println("The user is cute");

      }
    }
  }
