package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isCheeseAdded;
    boolean toppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        if(isVeg){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isTakeAwayAdded  = false;
        this.toppingsAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isCheeseAdded==false){
            isCheeseAdded = true;
            this.price+=this.cheesePrice;
        }

    }

    public void addExtraToppings(){
        if(toppingsAdded==false){
            this.price+=this.toppingPrice;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(isTakeAwayAdded==false){
            this.price+=this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        if(isBillGenerated==false){
            if(isCheeseAdded==true){
                this.bill +=  "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(toppingsAdded){
                this.bill += "Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
