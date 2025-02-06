/*
 * Name: Chris Reeder
 * Student Number: 301581511
 * Date: 2025/01/22
 */

package cmpt213.assignment1.importantdaystracker;

import java.util.List;
import java.util.Scanner;

/**
 * Provides a text-based interface to manage a list of ImportantDay objects.
 * Users can add, remove, list, and search the important days.
 */
public class Main {

    /**
     * Entry point of the application. Initializes a manager and provides a command
     * line interface for user interaction.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        ImportantDayManager manager = new ImportantDayManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Important Days Manager!");

        while (running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "1":
                    addImportantDay(manager, scanner);
                    break;
                case "2":
                    removeImportantDay(manager, scanner);
                    break;
                case "3":
                    listImportantDays(manager);
                    break;
                case "4":
                    searchImportantDays(manager, scanner);
                    break;
                case "5":
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    /**
     * Prints the main menu.
     */
    private static void printMenu() {
        System.out.println("\nPlease choose an option:");
        System.out.println("1) Add an Important Day    (type '1')");
        System.out.println("2) Remove an Important Day (type '2')");
        System.out.println("3) List All Important Days (type '3')");
        System.out.println("4) Search an Important Days (type '4')");
        System.out.println("5) Exit   (type '5')");
        System.out.print("Your choice: ");
    }

    /**
     * Prompts the user to add an important day by specifying name, date, and
     * description.
     *
     * @param manager the ImportantDayManager to which the day is added
     * @param scanner a scanner to read user input
     */
    private static void addImportantDay(ImportantDayManager manager, Scanner scanner) {
        System.out.print("Enter the name of the day: ");
        String name = scanner.nextLine();

        System.out.print("Enter the date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter a short description: ");
        String description = scanner.nextLine();

        ImportantDay newDay = new ImportantDay(name, date, description);
        manager.addDay(newDay);
        System.out.println("Important day added successfully!");
    }

    /**
     * Prompts the user to remove an important day by specifying its name.
     *
     * @param manager the ImportantDayManager from which the day is removed
     * @param scanner a Scanner to read user input
     */
    private static void removeImportantDay(ImportantDayManager manager, Scanner scanner) {
        System.out.print("Enter the name of the day to remove: ");
        String name = scanner.nextLine();

        boolean removed = manager.removeDayByName(name);
        if (removed) {
            System.out.println("Important day removed successfully!");
        } else {
            System.out.println("No important day found with that name.");
        }
    }

    /**
     * Lists all important days.
     *
     * @param manager the ImportantDayManager that holds the days
     */
    private static void listImportantDays(ImportantDayManager manager) {
        List<ImportantDay> allDays = manager.getAllDays();
        if (allDays.isEmpty()) {
            System.out.println("No important days recorded.");
            return;
        } else {
            System.out.println("\n--- List of All Important Days ---");
            for (ImportantDay day : allDays) {
                System.out.println(day);
            }
            
        }
    }

    /**
     * Prompts the user to search for important days by name or date.
     *
     * @param manager the ImportantDayManager that holds the days
     * @param scanner a Scanner to read user input
     */
    private static void searchImportantDays(ImportantDayManager manager, Scanner scanner) {
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();
        List<ImportantDay> resultByName = manager.searchDaysByName(searchName);
        if (resultByName.isEmpty()) {
            System.out.println("No important days found with that name.");
        } else {
            System.out.println("\n--- Search Results ---");
            for (ImportantDay day : resultByName) {
                System.out.println(day);
            }
        }
    }
}