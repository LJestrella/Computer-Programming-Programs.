package lab.arrays01;
import java.util.*;

public class ExamAnalysis {
    public static void main(String pito[]) {
	Scanner lj = new Scanner(System.in);
        
        int[] scores = new int[10];
        int passed =0;
	int failed = 0;
     
     

        System.out.println("Enter 10 exam scores:");
	


        for (int i = 0; i < scores.length; i++) {
            System.out.println("Scores of student " + (i + 1) + ": ");
           scores[i] = lj.nextInt();
	}
        

       System.out.println("\n Exam Results");
	System.out.println("Exam Scores: ");

         for (int i = 0; i < scores.length; i++) {
	System.out.print(scores[i] + " ");

	if (scores[i] >= 75) {
     	    passed++;
   	 } else {
          failed++;
       
            }
        }

     
        System.out.println("\n\nPassed: " + passed);
        System.out.println("Failed: " + failed);
    }
}