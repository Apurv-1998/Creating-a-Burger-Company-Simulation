package com.OOPS_MASTER_CHALLENGE;


import java.util.ArrayList;

public class Burger {

    private String breadRoll;
    private String meat;
    private double price;
    private Lettuce lettuce;
    private Carrot carrot;
    private Tomato tomato;
    private Cucumber cucumber;

    protected ArrayList<String> list; //assigned protected so that it can be used freely

    public Burger(String breadRoll, String meat, double price, Lettuce lettuce, Carrot carrot, Tomato tomato, Cucumber cucumber) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
        this.lettuce = lettuce;
        this.carrot = carrot;
        this.tomato = tomato;
        this.cucumber = cucumber;
        list = new ArrayList<>();
    }


    public void menu()
    {
        System.out.println("The initial additional's along with the price list : ");
        System.out.println("Select the index to include");

        System.out.println("1: Lettuce and price = " + lettuce.getPrice());
        System.out.println("2: Carrot and price = " + carrot.getPrice());
        System.out.println("3: Cucumber and price = " + cucumber.getPrice());
        System.out.println("4:Tomato and price = " + tomato.getPrice());

    }

    public void setPrice(int n)
    {
        System.out.println("Press any character to exit");
            switch(n)
            {
                case 1:
                    System.out.println("additional included = Lettuce");
                    list.add("Lettuce");
                    this.price+=lettuce.getPrice();
                    break;
                case 2:
                    System.out.println("additional included = Carrot");
                    list.add("Carrot");
                    this.price+=carrot.getPrice();
                    break;
                case 3:
                    System.out.println("additional included = Cucumber");
                    list.add("Cucumber");
                    this.price+=cucumber.getPrice();
                    break;
                case 4:
                    System.out.println("additional included = Tomato");
                    list.add("Tomato");
                    this.price+=tomato.getPrice();
                    break;

            }
    }

    public void getPrice()
    {
        System.out.println("Included additional's");
        for(int i=0;i<list.size();i++) {
            System.out.printf("%s ", list.get(i));
            System.out.printf(",");
        }
        System.out.println();
        System.out.println("Total Price = " + this.price);
    }

    public void setCost(double cost)
    {
        price = cost;
    }
    public double getCost()
    {
        return this.price;
    }

}
