import java.util.Scanner;

public class Main {
    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double total = listedPrice + tax + tax;

        System.out.println("Your listed price: " + listedPrice);
        System.out.println("Thanks for the tip: " + tip);
        System.out.println("Estimated tax: " + tax);
//        System.out.println("You total meal price is: " + total);
        return total;
    }

    public static void announceTeaTime() {
        System.out.println("Waiting for team time...");
        System.out.println("Type a random word and press enter");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.out.println("It's tea time");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my cafe!");
        announceTeaTime();

        System.out.println("order");
        System.out.println("eat");
        System.out.println("enjoy");

        double groupMealTotalCost = calculateTotalMealPrice(1200,0.10,0.001);
        System.out.println(groupMealTotalCost);

        System.out.println("Thank you for coming..");
    }
}
