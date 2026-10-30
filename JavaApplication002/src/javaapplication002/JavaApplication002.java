/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication002;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication002 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
        double base;
        double altura;
        double area;
        

        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();

        area = (base * altura) / 2;
        
        System.out.printf("El area del triangulo es %.2f\n" , area);
    
    }
    
}

