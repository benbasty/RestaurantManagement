package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
    ArrayList<Food> foodList = new ArrayList<>();
    ArrayList<GuestOrder> guestsOrder = new ArrayList<>();
    Food food; //?
    public GuestOrder guestOrder; //?
    public int SelectFood; // ?
    public ManageFood() { //?

    }
    Scanner scanner = new Scanner(System.in);
    public void input() {
        System.out.print("Enter the number of food to add in the menu: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Food food = new Food();
            food.input();
            foodList.add(food);
        }
    }
    public void print() {
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println((i+1) + ". " + foodList.get(i).detail());
        }
    }
    public void Price() {
        float priceFood = 0;
        float totalPayment = 0;
        int number;
        GuestOrder guest = new GuestOrder();
        guest.input();
        guestsOrder.add(guest);
        for (int i = 0; i < 10; i++) {
            System.out.print("Select Food " + (i + 1));
            SelectFood = scanner.nextInt();
            if (SelectFood == 0) {
                guest.setTotalPayment(totalPayment);
                System.out.println("Total Payment: " + totalPayment);
                System.out.println("Thank you, see you again");
                break;
            } else {
                System.out.print("Enter number: ");
                number = scanner.nextInt();
                Food food = foodList.get(SelectFood - 1);
                guest.setEatingList(food);
                priceFood = food.price * number;
            }
            totalPayment += priceFood;
            System.out.println("Order finish");
            System.out.println("Payment " + (i + 1) + " is:");
            System.out.println(" " + priceFood);
            System.out.println("Finish Order enter 0");
        }

    }

    public void printOrder() {
        for (int i = 0; i < guestsOrder.size(); i++) {
            guestsOrder.get(i).print();
        }
    }
    public void search() {
        Scanner scanner = new Scanner(System.in);
        String idTable;
        int up = 0;
        System.out.print("Enter table number payment: ");
        idTable = scanner.nextLine();
        for (int i = 0; i < guestsOrder.size(); i++) {
            if (guestsOrder.get(i).getIdtable().equalsIgnoreCase(idTable)) {
                guestsOrder.get(i).print();
                up++;
            }

        }
        if (up == 0) {
            System.out.println("No such table number: " + idTable);
        }
    }

    public String editName() {
        System.out.print("Enter name to edit: ");
        return scanner.nextLine();
    }

    public float editPrice() {
        System.out.print("Enter price to edit: ");
        return scanner.nextFloat();
    }

    public void editFood() {
        String nameFood;
        int up = 0;
        System.out.print("Enter food name to fix: ");
        nameFood = scanner.nextLine();
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getName().equals(nameFood)) {
                up++;
                foodList.get(i).setName(editName());
                foodList.get(i).setPrice(editPrice());
                break;
            }

        } if (up == 0) {
            System.out.println("No such food name as: " + nameFood);
        }
    }

    public void deleteFood() {
        String deleteFood;
        int up = 0;
        System.out.println("Enter food name to delete: ");
        deleteFood = scanner.nextLine();
        deleteFood = scanner.nextLine();
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getName().equals(deleteFood)) {
                up++;
                foodList.remove(i);
                System.out.println("Deletion complete");
                break;
            }

        }
        if (up == 0) {
            System.out.println("No such food name as " + deleteFood);
        }
    }

}
