package com.robosh.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BouquetServiceTest {

    private BouquetService bouquetService;

    @Before
    public void setUp() {
        bouquetService = new BouquetService();
    }

    @After
    public void tearDown() {
        bouquetService.removeFlowers();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowAnExceptionOnNullFlowerCountNegative() {
        bouquetService.addFlowers("rose", 0);
    }

    @Test
    public void shouldAddOneFlower() {
        bouquetService.addFlowers("rose", 1);
        assertEquals(1, bouquetService.getAllFlowers().size());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowRuntimeExceptionWrongFlowerInput() {
        bouquetService.addFlowers("rese", 0);
    }

    @Test
    public void shouldReturnBouquetPrice() {
        bouquetService.addFlowers("rose", 12);
        assertEquals(1440, bouquetService.getBouquetCosts(), 0.1);
    }

    @Test
    public void shouldNotEqualsWrongBouquetPrice() {
        bouquetService.addFlowers("rose", 12);
        assertNotEquals(1460, bouquetService.getBouquetCosts(), 0.1);
    }

    @Test
    public void shouldRemoveAllFlowers() {
        bouquetService.addFlowers("rose", 12);
        bouquetService.removeFlowers();
        assertEquals(0, bouquetService.getAllFlowers().size());
    }

}
