import java.util.Scanner;

public class CoffeeMachine {
    public static void displayIngredients(int water, int milk, int coffee, int numDispCups, int moneyInMac){
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(numDispCups + " of disposable cups");
        if (moneyInMac == 0) {
            System.out.println(moneyInMac + " of money");
        } else {
            System.out.println("$" + moneyInMac + " of money");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int numDispCups = 9;
        int moneyInMac = 550;

        System.out.println("Write action (buy, fill, take):");
        String command = scanner.next();

        while (!command.equals("exit")) {

            if (command.equals("buy")) {
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu:");
                String coffeeType = scanner.next();
                switch (coffeeType) {
                    case "1":
                        if (water < 250){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (coffee < 16) {
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if (numDispCups == 0) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");
                        System.out.println();
                        water -= 250;
                        coffee -= 16;
                        moneyInMac += 4;
                        numDispCups--;
                        break;
                    case "2":
                        if (water < 350){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffee < 20) {
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if (numDispCups == 0) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");
                        water -= 350;
                        milk -= 75;
                        coffee -= 20;
                        moneyInMac += 7;
                        numDispCups--;
                        break;
                    case "3":
                        if (water < 200){
                            System.out.println("Sorry, not enough water!");
                            break;
                        } else if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                            break;
                        } else if (coffee < 12) {
                            System.out.println("Sorry, not enough coffee!");
                            break;
                        } else if (numDispCups == 0) {
                            System.out.println("Sorry, not enough cups!");
                            break;
                        }
                        water -= 200;
                        milk -= 100;
                        coffee -= 12;
                        moneyInMac += 6;
                        numDispCups--;
                        break;
                    case "back":
                        ;
                }

            } else if (command.equals("fill")) {
                System.out.println();
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
                System.out.println();
                System.out.println("I gave you $" + moneyInMac);
                moneyInMac = 0;
            } else if (command.equals("remaining")) {
                displayIngredients(water, milk, coffee, numDispCups, moneyInMac);
            }

            System.out.println();
            System.out.println("Write action (buy, fill, take):");
            command = scanner.next();
        }



    }
}









//switch (command) {
//        case "buy":
//        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
//        int coffeeType = scanner.nextInt();
//        switch (coffeeType) {
//        case 1:
//        if (water < 250) {
//        System.out.println("Sorry, not enough of water!");
//        continue;
//        }
//        if (coffee < 16) {
//
//        }
//        water -= 250;
//        coffee -= 16;
//        moneyInMac += 4;
//        break;
//        case 2:
//        water -= 350;
//        milk -= 75;
//        coffee -= 20;
//        moneyInMac += 7;
//        break;
//        case 3:
//        water -= 200;
//        milk -= 100;
//        coffee -= 12;
//        moneyInMac += 6;
//        break;
//        }
//        numDispCups--;
//        break;
//
//        case "fill":
//        System.out.println("Write how many ml of water do you want to add:");
//        int newWater = scanner.nextInt();
//        System.out.println("Write how many ml of milk do you want to add:");
//        int newMilk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans do you want to add:");
//        int newCoffee = scanner.nextInt();
//        System.out.println("Write how many disposable cups of coffee do you want to add:");
//        int newCups = scanner.nextInt();
//
//        water += newWater;
//        milk += newMilk;
//        coffee += newCoffee;
//        numDispCups += newCups;
//        break;
//
//        case "take":
//        System.out.println("I gave you $" + moneyInMac);
//        moneyInMac = 0;
//        break;
//
//        case "remaining":
//        displayIngredients(water, milk, coffee, numDispCups, moneyInMac);
//        break;
//        }