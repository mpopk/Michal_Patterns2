package com.kodilla.kodillapatterns2.decorator.taxi;

import com.kodilla.kodillapatterns2.decorator.taxiportal.*;
import org.junit.Test;


import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(0, calculatedCost.compareTo(new BigDecimal(5.0)));
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course", description);
    }


    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        // Given
        TaxiOrder theOrder = new ChildSeatDecorator(new MyTaxiNetworkOrderDecorator(new BasicTaxiOrder()));
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(0, calculatedCost.compareTo(new BigDecimal(37.0)));
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        // Given
        TaxiOrder theOrder = new ChildSeatDecorator(new MyTaxiNetworkOrderDecorator(new BasicTaxiOrder()));
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }


    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(0, calculatedCost.compareTo(new BigDecimal(57.0)));
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        // Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Drive a course by Taxi Network variant VIP + child seat express service", description);
    }

}
