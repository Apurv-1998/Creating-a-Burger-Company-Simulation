package com.OOPS_MASTER_CHALLENGE;

public class HealthyBurger extends Burger {

    private BeetRoot beetroot;
    private Spinach spinach;

    public HealthyBurger(String breadRoll, String meat, double price, Lettuce lettuce, Carrot carrot, Tomato tomato, Cucumber cucumber, BeetRoot beetroot, Spinach spinach) {
        super(breadRoll, meat, price, lettuce, carrot, tomato, cucumber);
        this.beetroot = beetroot;
        this.spinach = spinach;
    }


    @Override
    public void menu() {
        super.menu();
        System.out.println("5. BeetRoot and price = " + beetroot.getPrice());
        System.out.println("6. Spinch and price = " + spinach.getPrice());
        System.out.println("Select any character to exit");
    }

    @Override
    public void setPrice(int n) {
        super.setPrice(n);
        switch(n)
        {
            case 5:
                System.out.println("Additional include BeetRoot");
                double a = super.getCost()+beetroot.getPrice();
                super.setCost(a);
                super.list.add("BeetRoot");
                break;
            case 6:
                System.out.println("Additional Included Spinach");
                double b = super.getCost()+spinach.getPrice();
                super.setCost(b);
                super.list.add("Spinach");
                break;
        }
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }
}
