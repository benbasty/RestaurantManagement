package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Food> foodList = new ArrayList<>();
        ManageFood manageFood = new ManageFood();
//        manageFood.input();
//        manageFood.print();
//        manageFood.Price();
//        manageFood.printOrder();
        int select;
        Scanner scanner = new Scanner(System.in);
        do {
            Menumain();
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    do {
                        MenuManageFood();
                        select = Integer.parseInt(scanner.nextLine());
                        switch (select) {
                            case 1:
                                manageFood.input();
                                break;
                            case 2:
                                manageFood.print();
                                manageFood.editFood();
                                break;
                            case 3:
                                manageFood.print();
                                manageFood.deleteFood();
                                break;
                            case 4:
                                manageFood.printOrder();
                                break;
                            case 5:
                                manageFood.search();
                                break;
                            case 0:
                                System.out.println("BACK to the Menu");
                            default:
                                break;
                        }
                    } while (select != 0);
                    break;
                case 2:
                    do {
                        MenuOrder();
                        select = Integer.parseInt(scanner.nextLine());
                        switch (select) {
                            case 1:
                                manageFood.print();
                                manageFood.Price();
                                break;
                            case 0:
                                System.out.println("BACK to the Menu");
                            default:
                                break;
                        }
                    } while (select != 0);
                    break;
                default:
                    break;
            }
        } while (select != 3);
    }
    static void MenuManageFood() {
        System.out.println("----------MENU MANAGEFOOD----------");
        System.out.println("0. BACK to the Main Menu");
        System.out.println("1. Add Food");
        System.out.println("2. Edit Food");
        System.out.println("3. Delete food");
        System.out.println("4. Print info Table Order");
        System.out.println("5. Payment");
    }
    static void MenuOrder() {
        System.out.println("----------MENU MAIN----------");
        System.out.println("0. BACK to the Main Menu");
        System.out.println("1. Print Menu food and Order");
        System.out.println("----------------------------");
        System.out.println("Select");
    }
    static void Menumain() {
        System.out.println("----------MENU MAIN----------");
        System.out.println("1. Manage Food");
        System.out.println("2. Manage order");
        System.out.println("3. Exit");
    }
}
