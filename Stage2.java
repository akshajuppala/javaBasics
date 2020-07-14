import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        // System.out.println("Starting to make a coffee");
        // System.out.println("Grinding coffee beans");
        // System.out.println("Boiling water");
        // System.out.println("Mixing boiled water with crushed coffee beans");
        // System.out.println("Pouring coffee into the cup");
        // System.out.println("Pouring some milk into the cup");
        // System.out.println("Coffee is ready!");
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);
        int numCoffeeCups = scanner.nextInt();
        
        System.out.print("For ");
        System.out.print(numCoffeeCups);
        System.out.println(" cups of coffee you will need:");
        System.out.print(numCoffeeCups*200);
        System.out.println(" ml of water");
        System.out.print(numCoffeeCups*50);
        System.out.println(" ml of milk");
        System.out.print(numCoffeeCups*15);
        System.out.println(" g of coffee beans");
    }
}