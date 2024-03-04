package com.driver;

public class Pizza {

    private int price ;
    private int cheeseAmount ;
    private int toppingsAmount ;
    private int paperbagAmount;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean paperbagAdded = false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.toppingsAmount = 70;
        }
        else {
            this.price = 400;
            this.toppingsAmount = 120;
        }

        this.paperbagAmount = 20;
        this.cheeseAmount = 80;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheeseAdded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        extraToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        paperbagAdded = true;
    }

    public String getBill(){
        // your code goes here
        int total = price;

        bill = "Base Price Of The Pizza: " + this.price + "\n";

        if(extraCheeseAdded){
            bill += "Extra Cheese Added: " + cheeseAmount + "\n";
            total+=cheeseAmount;
        }
        if (extraToppingsAdded) {
            bill += "Extra Toppings Added: " + toppingsAmount  + "\n";
            total+=toppingsAmount;
        }
        if (paperbagAdded) {
            bill += "Paperbag Added: " + paperbagAmount + "\n";
            total+=paperbagAmount;
        }
        bill += "Total Price: " + total + "\n";
        return this.bill;
    }
}
