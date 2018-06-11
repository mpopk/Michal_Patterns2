package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

abstract class ToppingDecorator implements Pizza{


    protected Pizza pizza;



    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }


    public String getDescription() {
        return pizza.getDescription();
    }

    public BigDecimal getCost() {
        return pizza.getCost();


    }



}
