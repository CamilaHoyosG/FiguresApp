/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unicauca.figures;

import com.unicauca.figures.domain.presentation.GUICircle;
import com.unicauca.figures.domain.presentation.GUISquare;
import com.unicauca.figures.domain.presentation.GUITriangle;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author libardo
 */
public class FiguresApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la opción deseada (1 para círculo, 2 para cuadrado, 3 para triangulo): ");
        String entrada = scanner.nextLine().trim(); // Utiliza trim() para eliminar espacios en blanco

        switch (entrada) {
            case "1" -> new GUICircle().setVisible(true);
            case "2" -> new GUISquare().setVisible(true);
            case "3" -> new GUITriangle().setVisible(true);
            default -> System.out.println("Opción no válida");
        }
    }
}

