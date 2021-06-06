/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Zachary Flanagan
 */

package ex14;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner orderAmount = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String orderAmountS = orderAmount.nextLine();
        double orderAmountD = Double.parseDouble(orderAmountS);

        Scanner state = new Scanner(System.in);
        System.out.print("What is the state? ");
        String stateS = state.nextLine();

        double tax = 0.055 * orderAmountD;

        if(stateS.equals("WI")){
            System.out.format("The subtotal is $%.2f.\n", orderAmountD);
            orderAmountD = orderAmountD + tax;
            System.out.format("The tax is $%.2f.\n", tax);
        }
        System.out.format("The total is $%.2f.", orderAmountD);
    }
}