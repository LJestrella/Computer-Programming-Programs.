package lab.arrays01;
import java.util.*;

public class SalesTracker {
    public static void main(String pito[]) {
	Scanner lj = new Scanner(System.in);
        
        double[] sales = new double[7];
        
        double total = 0;
     

        System.out.println("Sales Values:");
	


        for (int i = 0; i < sales.length; i++) {
            System.out.println("Enter sales for Day " + (i + 1) + ": ");
           sales[i] = lj.nextDouble();
	}
          double highest = sales[0];
       
      
       System.out.println("Daily Sales");
           for (int i = 0; i<sales.length; i++) {
			total += sales[i];
            System.out.println("Day " + (i + 1) + ": " + sales[i]);
            if (sales[i] > highest) {
                highest = sales[i];
            }
        }

        System.out.println("\nResults:");
        System.out.println("Total Sales: " + total);
        System.out.println("Highest Sale: " + highest);
    }
}