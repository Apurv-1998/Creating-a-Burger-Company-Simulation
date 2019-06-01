package com.OOPS_MASTER_CHALLENGE;


// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional's, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creating Instances
        Lettuce lettuce = new Lettuce();
        Carrot carrot = new Carrot();
        Cucumber cucumber = new Cucumber();
        Tomato tomato = new Tomato();
        BeetRoot beetRoot = new BeetRoot();
        Spinach spinach = new Spinach();
        Chips chips = new Chips();
        Drinks drinks = new Drinks();

        //Setting the cost
        lettuce.setPrice(0.45);
        carrot.setPrice(0.67);
        cucumber.setPrice(0.34);
        tomato.setPrice(0.23);
        beetRoot.setPrice(0.87);
        spinach.setPrice(0.56);
        chips.setPrice(0.82);
        drinks.setPrice(1.05);

        //Simulation
        Scanner input = new Scanner(System.in);
        System.out.println();
        Burger burger = new Burger("Bread","Red",1.23,lettuce,carrot,tomato,cucumber);
        HealthyBurger healthyBurger = new HealthyBurger("Brown-Rye Bread","White",1.23,lettuce,carrot,tomato,cucumber,beetRoot,spinach);
        DeluxeBurger deluxeBurger = new DeluxeBurger("Any Type","Red",1.23,chips,drinks);
        System.out.println("Please Select : ");
        System.out.println("H for Healthy Burger");
        System.out.println("D for Deluxe Burger");
        System.out.println("B for Normal Burger");
        char c = input.next().charAt(0);
        if(c=='H') {
            System.out.println("Healthy Burger selected");
            healthyBurger.menu();
            while (input.hasNextInt()) {
                int n = input.nextInt();
                healthyBurger.setPrice(n);
            }
            healthyBurger.getPrice();
        }
        else if(c=='D')
        {
            System.out.println("Deluxe burger selected");
            deluxeBurger.menu();
            while (input.hasNextInt()) {
                int n = input.nextInt();
                deluxeBurger.setPrice(n);
            }
            deluxeBurger.getPrice();
        }
        else if(c=='B')
        {
            System.out.println("Normal Burger Selected");
            burger.menu();
            while (input.hasNextInt()) {
                int n = input.nextInt();
                burger.setPrice(n);
            }
            burger.getPrice();
        }
        else
            System.out.println("Sorry! Item Currently Unavailable");

    }
}
