package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class PlainPizza implements Pizza {



    public String getDescription() {
        return "Thin dough";
    }

    public BigDecimal getCost() {
        return new BigDecimal(23);
    }
}
