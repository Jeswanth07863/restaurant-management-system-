
package com.rest;

import com.rest.CLI.TableCLI;
import com.rest.CLI.OrderCLI;
import com.rest.CLI.OrderItemCLI;
import com.rest.CLI.MenuItemCLI;
import com.rest.services.OrderService;
import com.rest.services.OrderItemService;
import com.rest.services.MenuItemService;
import com.rest.services.TableService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TableCLI tableCLI = new TableCLI(new TableService());
        OrderCLI orderCLI = new OrderCLI(new OrderService());
        OrderItemCLI orderItemCLI = new OrderItemCLI(new OrderItemService());
        MenuItemCLI menuItemCLI = new MenuItemCLI(new MenuItemService());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Restaurant Management ===");
            System.out.println("1. View All Tables");
            System.out.println("2. View All Orders");
            System.out.println("3. View All Order Items");
            System.out.println("4. View All Menu Items");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();
            if ("1".equals(choice)) {
                tableCLI.displayAllTables();
            } else if ("2".equals(choice)) {
                orderCLI.displayAllOrders();
            } else if ("3".equals(choice)) {
                orderItemCLI.displayAllOrderItems();
            } else if ("4".equals(choice)) {
                menuItemCLI.displayAllMenuItems();
            } else if ("0".equals(choice)) {
                System.out.println("Thank You!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
