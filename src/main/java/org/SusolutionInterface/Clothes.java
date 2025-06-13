package org.SusolutionInterface;


public class Clothes implements Movable, Sellable, Discountable {
    @Override
    public void move() {
        System.out.println("Одежду положили в корзину");
    }
    @Override
    public int getPrice(){
        return 1000;
    }
    @Override
    public int getDiscount(){
        return 150;
    }
}