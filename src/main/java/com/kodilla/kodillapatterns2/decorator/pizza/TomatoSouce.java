package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoSouce extends ToppingDecorator{


    public TomatoSouce(Pizza pizza) {
        super(pizza);

    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+",Tomato Souce";
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost().add(new BigDecimal(5) );
    }

}
