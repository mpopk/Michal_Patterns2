package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void pizzaGetCost() {
        // Given
        Pizza basicPizza = new PlainPizza();
        // When
        BigDecimal cost = basicPizza.getCost();
        //Then
        assertEquals(0, cost.compareTo(new BigDecimal(23)));
    }

    @Test
    public void pizzaGetDescription() {
        // Given
        Pizza basicPizza = new PlainPizza();
        // When
        String description = basicPizza.getDescription();
        //Then
        assertEquals("Thin dough", description);
    }

    @Test
    public void pizzaWithMozzarellaAndTomatoSouceCost(){
        // Given
        Pizza basicPizza = new PlainPizza();
        basicPizza = new Mozzarella(basicPizza);
        basicPizza = new TomatoSouce(basicPizza);
        // When
        BigDecimal cost = basicPizza.getCost();
        //Then
        assertEquals(0, cost.compareTo(new BigDecimal(40)));
    }

    @Test
    public void pizzaWithMozzarellaAndTomatoSouceDesription(){
        // Given
        Pizza basicPizza = new PlainPizza();
        basicPizza = new Mozzarella(basicPizza);
        basicPizza = new TomatoSouce(basicPizza);
        // When
        String description = basicPizza.getDescription();
        //Then
        assertEquals("Thin dough,Mozzarella,Tomato Souce", description);
    }

}
