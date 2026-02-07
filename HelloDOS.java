import java.util.Scanner;

class HelloDOS {
    public static void main (String Miles[]){
        Scanner scannerniMiles = new Scanner(System.in);
        int x, y, z;

        System.out.println("Hello World in DOS!");
        System.out.println("Enter your numbers:");
        System.out.print("Number 1: ");
        x = scannerniMiles.nextInt();
        System.out.print("Number 2: ");
        y = scannerniMiles.nextInt();
        System.out.print("Number 3: ");
        z = scannerniMiles.nextInt();
        System.out.println("Sum: " + Sum(x, y, z));
    }

    static int Sum (int x, int y, int z) {
        int ans = x + y + z;
        return ans;    
    }
}
