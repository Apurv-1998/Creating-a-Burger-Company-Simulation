package com.OOPS_MASTER_CHALLENGE;

public class DeluxeBurger extends Burger {

    private Chips chips;
    private Drinks drinks;

    public DeluxeBurger(String breadRoll, String meat, double price, Chips chips, Drinks drinks) {
        super(breadRoll, meat, price, null, null, null, null);
        this.chips = chips;
        this.drinks = drinks;
    }


    @Override
    public void menu() {
        System.out.println("Special Deluxe Burger : ");
        System.out.println("Only two additional available : ");
        System.out.println("Select the index number to choose the add-ons ");
        System.out.println("1: Chips and price = " + chips.getPrice());
        System.out.println("2: Drinks and price = " + drinks.getPrice());
        System.out.println("Press any character to exit");
    }

    @Override
    public void setPrice(int n) {



        switch (n)
        {
            case 1:
                double a = super.getCost()+chips.getPrice();
                super.setCost(a);
                super.list.add("Chips");
                break;
            case 2:
                double b = super.getCost()+drinks.getPrice();
                super.setCost(b);
                super.list.add("Drinks");
                break;
            default:
                System.out.println("Enter a valid number either 1 or 2");
                break;
        }
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }
}
