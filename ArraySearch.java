package lab.arrays01;
import java.util.*;

public class ArraySearch {
    public static void main(String pito[]) {
	Scanner lj = new Scanner(System.in);
        
        int[] numbers = new int[8];
        int index;

              for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter value " + (i + 1) + ": ");
           numbers[i] = lj.nextInt();
	}
        
      do {
       System.out.println("\n Array Elements");
         for (int n : numbers) {
	System.out.print(n + " ");
	}
    

 
   System.out.print("\n\nSearching for: ");
   int value = lj.nextInt();
   index = -1;

     for (int i = 0; i < numbers.length; i++) {
	if (numbers[i] == value) {
     	    index = i;
          
            }
        }
        
	if (index != -1) {
        System.out.println("Value found at the index " + index);
       } else {
	System.out.println("Value not found");
       }
    } while (index != -1);
  }
}