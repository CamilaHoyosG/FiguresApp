/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

/**
 *
 * @author jose0
 */
public class Square extends Figure{
    private double side;

    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calculatePerimeter() {
        return side*4;
    }
    
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
