package com.driver;

public class Pizza {

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            setPrice(300);
        }else setPrice(400);

        this.bill = String.valueOf(price);
    }
    public Pizza(Boolean isVeg, int i){
        this.isVeg = isVeg;
        if(isVeg==true){
            setPrice(450);
        }else setPrice(550);

        this.bill = String.valueOf(price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        bill = String.valueOf(Integer.valueOf(bill)+80);
    }

    public void addExtraToppings(){
        if(isVeg){
            bill = String.valueOf(Integer.valueOf(bill)+70);
        }else{
            bill = String.valueOf(Integer.valueOf(bill)+120);
        }
    }

    public void addTakeaway(){
        bill = String.valueOf(Integer.valueOf(bill)+20);
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
