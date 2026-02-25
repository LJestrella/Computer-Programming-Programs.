import java.util.*;

public class StringTester {
    public static void main(String pito []) {
        Scanner lj = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = lj.nextLine();

        System.out.println("\n=== STRING ANALYSIS ===");
        System.out.println("Original: " + input);
        System.out.println("Last character: " + input.charAt(input.length() - 1));
        System.out.println("Replaced spaces: " + input.replace(" ", "_"));
        System.out.println("First 5 characters: " + input.substring(0, 5));
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Trimmed: [" + input.trim() + "]");
        System.out.println("Contains 'Java'? " + input.contains("Java"));
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Starts with 'Hello'? " + input.startsWith("Hello"));
        System.out.println("Ends with '.'? " + input.endsWith("."));

  
    }
}