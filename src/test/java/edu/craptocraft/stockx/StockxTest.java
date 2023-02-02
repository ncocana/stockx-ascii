package edu.craptocraft.stockx;

import org.junit.Test;

import edu.craptocraft.stockx.item.Sneaker;

import static org.junit.Assert.*;

public class StockxTest {
    
    @Test
    public void testAppHasADraw() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        assertNotNull("App lacks a draw function.", Stockx.draw(sneaker));
    }
}
