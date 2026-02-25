import java.util.*;


public class WordAnalyzer {
    public static void main(String pito []) {
        Scanner lj = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String input = lj.nextLine();

        String[] words = input.split(" ");
        String longest = "";

        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Word count: " + words.length);
        System.out.println("Without vowels: " + input.replaceAll("(?i)[aeiou]", "*"));
        System.out.println("Longest word: " + longest);


    }
}