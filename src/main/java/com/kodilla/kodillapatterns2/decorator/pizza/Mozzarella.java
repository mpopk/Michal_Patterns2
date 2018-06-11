package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Mozzarella extends ToppingDecorator{


    public Mozzarella(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+",Mozzarella";
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost().add(new BigDecimal(12) );
    }
}
