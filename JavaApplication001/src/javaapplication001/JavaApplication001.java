/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication001;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        // TODO code application logic here
    
        // declaracion de variabales 
        String proyecto1;
        String proyecto2;
        String proyecto3;
        double gasto1;
        double gasto2;
        double gasto3;
        double gasto_mensual;
        
        System.out.println( "Ingrese el nombre del proyecto 1");
        proyecto1 = entrada.nextLine();
        
        System.out.println( "Ingrese el nombre del proyecto 2");
        proyecto2 = entrada.nextLine();
        
        System.out.println( "Ingrese el nombre del proyecto 3");
        proyecto3 =entrada.nextLine();
        
        System.out.println( "Ingrese gasto proyecto 1");
        gasto1 = entrada.nextDouble();
        
        System.out.println( "Ingrese  gasto proyecto 2");
        gasto2 = entrada.nextDouble();
        
        System.out.println( "Ingrese gasto proyecto 3");
        gasto3 = entrada.nextDouble();
        
        gasto_mensual = gasto1 + gasto2 + gasto3;
        
        System.out.printf("CONTROL DE GASTOS DE PROYECTOS\nProyectos:\n"
        + "------\n"
        + "1. %s: $%.2f\n"
        + "2. %s: $%.2f\n"
        + "3. %s: $%.2f\n"
        + "------\nGASTO MENSUAL TOTAL: $%.2f\n",
        proyecto1, gasto1,
        proyecto2, gasto2,
        proyecto3, gasto3,
        gasto_mensual);
        
        entrada.close();
                
       
    }
    
}
