/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.semFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CasoScanner {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String nombre="";
        double edad=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa nombre");
            nombre= teclado.nextLine();
            System.out.println("Ingresa edad");
            edad = teclado.nextDouble(); // "/n"
            teclado.nextLine();
        }
        
        
        
        
        
    }
}
