/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicauca.figures.domain.models;

/**
 *
 * @author jose0
 */
public class Triangle extends Figure{
    private double height, base, side2, side3;

    public Triangle(double height, double base,double side2, double side3){
        this.height = height;
        this.base = base;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculatePerimeter() {
        return base+side2+side3;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public void setSide3(double side3){
        this.side3 = side3;
    }    
}
