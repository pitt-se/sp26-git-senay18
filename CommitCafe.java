import java.util.Scanner;

public class CommitCafe {

    private static String barista = "Senay"; // STUDENT_TODO_1A: Change name
    // STUDENT_TODO_1B: Add a nickname or title for the barista
    private static String baristaTitle = "Lead Barista";

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
        cups++;
        if("Espresso".equals(drink)) {
            System.out.println("Grinding coffee beans for " + drink);
        } else if("Latte".equals(drink)) {
            System.out.println("Steaming milk for " + drink);
        }
        System.out.println(baristaTitle + " " + barista + " brewed a cup of " + drink);
        // STUDENT_TODO_2B: Add a second brew-related improvement
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of drink to brew: 1 for Espresso, 2 for Latte: ");
        int choice = scanner.nextInt();
        if(choice == 1) {
            brew("Espresso");
        } else if(choice == 2) {
            brew("Latte");
        }
        printSummary();
    }
}