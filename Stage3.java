import java.util.Scanner;

public class CoffeeMachine {
    public static void displayIngredients(int water, int milk, int coffee, int numDispCups, int moneyInMac){

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(numDispCups + " of disposable cups");
        System.out.println(moneyInMac + " of money");
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int numDispCups = 9;
        int moneyInMac = 550;

        displayIngredients(water, milk, coffee, numDispCups, moneyInMac);

        System.out.println("Write action (buy, fill, take):");
        String command = scanner.next();
        if (command.equals("buy")) {

            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int coffeeType = scanner.nextInt();
            switch (coffeeType) {
                case 1:
                    water -= 250;
                    coffee -= 16;
                    moneyInMac -= 4;
                    break;
                case 2:
                    water -= 350;
                    milk -= 75;
                    coffee -= 20;
                    moneyInMac -= 7;
                    break;
                case 3:
                    water -= 200;
                    milk -= 100;
                    coffee -= 12;
                    moneyInMac -= 6;
                    break;
            }
            numDispCups--;
        } else if (command.equals("fill")) {
            System.out.println("Write how many ml of water do you want to add:");
            int newWater = scanner.nextInt();
            System.out.println("Write how many ml of milk do you want to add:");
            int newMilk = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans do you want to add:");
            int newCoffee = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee do you want to add:");
            int newCups = scanner.nextInt();

            water += newWater;
            milk += newMilk;
            coffee += newCoffee;
            numDispCups += newCups;

        } else if (command.equals("take")) {
            System.out.println("I gave you $" + moneyInMac);
            moneyInMac = 0;
        }

        displayIngredients(water, milk, coffee, numDispCups, moneyInMac);


        

        
    }
}