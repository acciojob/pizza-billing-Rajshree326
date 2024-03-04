package com.driver;

public class Pizza {

    private int price ;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperbagAdded ;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }

        extraCheeseAdded = false;
        extraToppingsAdded = false;
        paperbagAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded) {
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded) {
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperbagAdded) {
            paperbagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        int total = price;

        bill = "Base Price Of The Pizza: " + this.price + "\n";

        if(extraCheeseAdded){
            bill += "Extra Cheese Added: " + 80 + "\n";
            total+=80;
        }
        if (extraToppingsAdded) {
            if(isVeg) {
                bill += "Extra Toppings Added: " + 70 + "\n";
                total += 70;
            }
            else{
                bill += "Extra Toppings Added: " + 120 + "\n";
                total += 120;
            }
        }
        if (paperbagAdded) {
            bill += "Paperbag Added: " + 20 + "\n";
            total+=20;
        }
        bill += "Total Price: " + total + "\n";
        return this.bill;
    }
}
