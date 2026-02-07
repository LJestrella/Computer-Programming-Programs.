import java.util.*;

     class guessGame {
      
       static Scanner lj = new Scanner(System.in);
       static int guess = 0;
       static Random N = new Random();
       static int secret = N.nextInt(100)+1;
       static String ans = "";
     public static void main (String pito []) {
      
      do { 
        secret = N.nextInt(100)+1;  guess = 0;
       do {
         System.out.print("Enter your Guess(1-100): ");
          guess = lj.nextInt();
          
          if (guess > secret) 
         System.out.println("too high");
           else if (guess < secret)
         System.out.println("too low");
            else 
           System.out.println("Congratulation!!!");
           } while (guess != secret);
             System.out.print("Play again baby? (Y/N): ");
             ans = lj.next();
    } while (!ans.equalsIgnoreCase("N"));
    System.out.println("Goodbye!!!");
    }
 }

