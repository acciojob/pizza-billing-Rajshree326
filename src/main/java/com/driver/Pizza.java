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
            price +=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingsAdded) {
            extraToppingsAdded = true;
            if(isVeg)price+=70;
            else price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!paperbagAdded) {
            paperbagAdded = true;
            price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
        bill = "Base Price Of The Pizza: 300 \n";
        else bill = "Base Price Of The Pizza: 400 \n";

        if(extraCheeseAdded){
            bill += "Extra Cheese Added: 80 \n";
        }
        if (extraToppingsAdded) {
            if(isVeg) {
                bill += "Extra Toppings Added: 70 \n";
            }
            else{
                bill += "Extra Toppings Added: 120 \n";
            }
        }
        if (paperbagAdded) {
            bill += "Paperbag Added: 20\n";

        }
        bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
