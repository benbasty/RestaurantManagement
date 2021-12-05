package com.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestOrder {
    public String Idtable;
    ArrayList<Food> eatingList = new ArrayList<Food>();
    public float totalPayment;

    public String getIdtable() {
        return Idtable;
    }

    public void setEatingList(Food food) {
        eatingList.add(food);
    }

    public void setTotalPayment(float totalPayment) {
        this.totalPayment = totalPayment;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter table number: ");
        Idtable = scanner.nextLine();
    }
    public void print() {
        System.out.println("-----------------------");
        System.out.println("Number Table: " + this.Idtable + "Total Payment: " + this.totalPayment);
        for (Food m: eatingList) {
            System.out.println("Selected Food is " + m.name);
        }
        System.out.println();
    }
}
