import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int numDispCups = 9;
    static int moneyInMac = 550;

    enum coffeeVariant {
        espresso(250, 0, 16, 4),
        latte(350, 75, 20, 7),
        cappuccino(200, 100, 12, 6);

        int reqWater;
        int reqMilk;
        int reqCoffee;
        int cost;

        coffeeVariant(int reqWater, int reqMilk, int reqCoffee, int cost) {
            this.reqWater = reqWater;
            this.reqMilk = reqMilk;
            this.reqCoffee = reqCoffee;
            this.cost = cost;
        }
    }

    public static void displayIngredients(){
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

    public static void doBuy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu:");
        String coffeeType = scanner.next();
        coffeeVariant user;
        switch (coffeeType) {
            case "1":
                user = coffeeVariant.valueOf("espresso");
                break;
            case "2":
                user = coffeeVariant.valueOf("latte");
                break;
            case "3":
                user = coffeeVariant.valueOf("cappuccino");
                break;
            case  "back":
                return;
            default:
                System.out.println("Coffee variant not available.");
                return;
        }

        if (water < user.reqWater){
            System.out.println("Sorry, not enough water!");
            return;
        } else if (milk < user.reqMilk) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else if (coffee < user.reqCoffee) {
            System.out.println("Sorry, not enough coffee!");
            return;
        } else if (numDispCups == 0) {
            System.out.println("Sorry, not enough cups!");
            return;
        }

        System.out.println("I have enough resources, making you a coffee!");
        System.out.println();
        water -= user.reqWater;
        milk -= user.reqMilk;
        coffee -= user.reqCoffee;
        numDispCups--;
        moneyInMac += user.cost;
    }

    public static void doFill() {
        Scanner scanner = new Scanner(System.in);

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
    }

    public static void doTake() {
        System.out.println();
        System.out.println("I gave you $" + moneyInMac);
        moneyInMac = 0;
    }

    public static void processCommand(String command) {
        switch (command) {
            case "buy":
                doBuy();
                break;
            case "fill":
                doFill();
                break;
            case "take":
                doTake();
                break;
            case "remaining":
                displayIngredients();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take):");
        String command = scanner.next();

        while (!command.equals("exit")) {

            processCommand(command);

            System.out.println();
            System.out.println("Write action (buy, fill, take):");
            command = scanner.next();
        }
    }
}