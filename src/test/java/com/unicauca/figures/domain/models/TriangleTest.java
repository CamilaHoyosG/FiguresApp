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
public class TriangleTest {
    
    public TriangleTest() {
    }
    /**
     * Test of calculateArea method, of class Triangle.
     */
    @Test
    public void testCalculateArea() {
        System.out.println("calculateArea");
        double height = 1.0;
        double base = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;
        Triangle triangle = new Triangle(height, base, side2, side3);
        double areaExpected = (base*height)/2;
        double areaActual = triangle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        
        height = 100;
        base = 100;
        side2 = 100;
        side3 = 100;
        triangle.setHeight(height);
        triangle.setBase(base);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        areaExpected = (base*height)/2;
        areaActual = triangle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        
        height = 39;
        base = 39;
        side2 = 39;
        side3 = 39;
        triangle.setHeight(height);
        triangle.setBase(base);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        areaExpected = (base*height)/2;
        areaActual = triangle.calculateArea();
        assertEquals(areaExpected, areaActual, 0.001);
        
    }

    /**
     * Test of calculatePerimeter method, of class Triangle.
     */
    @Test
    public void testCalculatePerimeter() {
        System.out.println("calculatePerimeter");
        double height = 1.0;
        double base = 1.0;
        double side2 = 1.0;
        double side3 = 1.0;
        Triangle triangle = new Triangle(height, base, side2, side3);
        double perimeterExpected = base+side2+side3;
        double perimeterActual = triangle.calculatePerimeter();
         assertEquals(perimeterExpected, perimeterActual, 0.001);
        
        height = 100;
        base = 100;
        side2 = 100;
        side3 = 100;
        triangle.setHeight(height);
        triangle.setBase(base);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        perimeterExpected = base+side2+side3;
        perimeterActual = triangle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
        
        height = 39;
        base = 39;
        side2 = 39;
        side3 = 39;
        triangle.setHeight(height);
        triangle.setBase(base);
        triangle.setSide2(side2);
        triangle.setSide3(side3);
        perimeterExpected = base+side2+side3;
        perimeterActual = triangle.calculatePerimeter();
        assertEquals(perimeterExpected, perimeterActual, 0.001);
    }
}
