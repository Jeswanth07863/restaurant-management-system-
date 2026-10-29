
package com.rest.CLI;

import com.rest.models.Table;
import com.rest.services.TableService;
import java.util.List;
import java.util.Scanner;

public class TableCLI {

    private final TableService service;
    private final Scanner scanner = new Scanner(System.in);

    public TableCLI(TableService service) {
        this.service = service;
    }

    public void start() {
        System.out.println("=== Restaurant Table Management ===");
        System.out.println("1. View All Tables");
        System.out.println("0. Exit");

        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            displayAllTables();
        } else if (choice == 0) {
            System.out.println("Thank You!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }

    public void displayAllTables() {
        List<Table> tables = service.getAllTables();

        System.out.println("\n=== ALL Tables ===");

        for (Table table : tables) {
            System.out.println(table);
        }
    }
}
