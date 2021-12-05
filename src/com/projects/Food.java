package com.projects;

import java.util.Scanner;

public class Food {
    public String name;
    public float price;

    public Food(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public Food() {
        this.name = name;
        this.price = price;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the food: ");
        name = scanner.nextLine();
        System.out.print("Enter price of the food: ");
        price = scanner.nextFloat();
    }
    public void Payment() {
        System.out.println("Price: " + price);
    }
    public String detail() {
        return name + " - " + price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
