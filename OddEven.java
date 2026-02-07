import java.util.*;

      class OddEven {
        public static void main (String pito[]) {
        Scanner lj = new Scanner(System.in);
  
      int num=0;
      int cd = 0;
     System.out.print("How many numbers?: ");
       cd = lj.nextInt();
      for ( int n=1; n<=cd; ++n) {
       System.out.print("Enter an Integer number: ");
       num = lj.nextInt();
      System.out.println("You entered " + letsCheck(num)+" number");        

     }
  }
     static String letsCheck (int m) {
     if (m%2==0)
      return "Even";
     else 
      return "Odd";   
       }

    }
