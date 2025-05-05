import java.util.Scanner;

public class Food_App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, Welcome to the Food App!");
        System.out.println("Please Create a Password");
        String password = sc.nextLine();
        System.out.println("Your Password is set [" + password + "]. Please login to continue.");
        System.out.println("Enter your Password:");
        String inputPassword = sc.nextLine();
        while (!inputPassword.equals(password)) {
            System.out.println("Incorrect Password. Please try again.");
            inputPassword = sc.nextLine();
        }
        if (inputPassword.equals(password)) {

            System.out.println("Login Successful! Welcome to the Food App.");
            System.out.println("Are you Hungry? (yes/no)");
            String hungry = sc.nextLine();
            if (hungry.equalsIgnoreCase("yes")) {
                System.out.println("Great! Let's order some food.");
                System.out.println("Menu: Pizza, Burger, Pasta, Salad");
                String order = sc.nextLine();

                while (!order.equalsIgnoreCase("Pizza") && !order.equalsIgnoreCase("Burger")
                        && !order.equalsIgnoreCase("Pasta") && !order.equalsIgnoreCase("Salad")) {
                    System.out.println("Invalid choice. Please select from the menu: Pizza, Burger, Pasta, Salad");
                    order = sc.nextLine();
                }
                if (order.equalsIgnoreCase("Pizza") || order.equalsIgnoreCase("Burger")
                        || order.equalsIgnoreCase("Pasta") || order.equalsIgnoreCase("Salad")) {
                    System.out.println("Do you want anything to Drink? (yes/no)");
                    String drink = sc.nextLine();
                    while (!drink.equalsIgnoreCase("yes") && !drink.equalsIgnoreCase("no")) {
                        System.out.println("Invalid choice. Please answer with yes or no.");
                        drink = sc.nextLine();
                    }
                    if (drink.equalsIgnoreCase("yes")) {
                        System.out.println("What would you like to drink? (Coke, Water, Juice)");
                        String drinkChoice = sc.nextLine();
                        while (!drinkChoice.equalsIgnoreCase("Coke") && !drinkChoice.equalsIgnoreCase("Water")
                                && !drinkChoice.equalsIgnoreCase("Juice")) {
                            System.out.println("Invalid choice. Please select from the menu: Coke, Water, Juice");
                            drinkChoice = sc.nextLine();
                        }
                        System.out.println("You have ordered: " + order + " with " + drinkChoice);
                        System.out.println("Your order is being prepared. Enjoy your meal!");
                    } else {
                        System.out.println("You have ordered: " + order);
                        System.out.println("Your order is being prepared. Enjoy your meal!");
                    }
                } else {
                    System.out.println("Invalid choice. Please select from the menu: Pizza, Burger, Pasta, Salad");
                }
            } else {
                System.out.println("Okay, Have a Good Day.");
                return;
            }
        } else {
            System.out.println("Incorrect Password. Please try again.");
        }
    }
}