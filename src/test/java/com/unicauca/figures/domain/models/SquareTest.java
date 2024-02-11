/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.unicauca.figures.domain.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jose0
 */
public class SquareTest {
    
    /**
     * Test of calculateArea method, of class Square.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double side = 1.0;
        Square square  = new Square(side);
        double areaExpected = Math.pow(side, 2);
        double areaActual = square.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        
        side = 100;
        square.setSide(side);
        areaExpected = Math.pow(side, 2);
        areaActual = square.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        
        side = 48;
        square.setSide(side);
        areaExpected = Math.pow(side, 2);
        areaActual = square.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
    }

    /**
     * Test of calculat
     * ePerimeter method, of class Square.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double side = 1.0;
        Square square  = new Square(side);
        double perimeterExpected = side * 4;
        double perimeterActual = square.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
        
        side = 100;
        square.setSide(side);
        perimeterExpected = side * 4;
        perimeterActual = square.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
        
        side = 52;
        square.setSide(side);
        perimeterExpected = side * 4;
        perimeterActual = square.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
}
