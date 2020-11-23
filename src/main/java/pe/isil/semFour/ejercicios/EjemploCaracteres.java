/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.semFour.ejercicios;

/**
 *
 * @author User
 */
public class EjemploCaracteres {
    
    public static void main(String[] args) {
        
        String nombre1="Anghelo"; //70
        String nombre2="Fiorella";//80
        
        //Mostrarlos de forma ascendente
        int valor = nombre1.compareToIgnoreCase(nombre2);
        System.out.println("Imprimir valor :"+valor);
        if (nombre1.compareToIgnoreCase(nombre2)<0) {
             System.out.println("Los nombres ordenados son :");
            System.out.println(""+nombre1);
            System.out.println(""+nombre2);
            
        } else {
            System.out.println("Los nombres ordenados son :");
            System.out.println(""+nombre2);
            System.out.println(""+nombre1);
        }
        
        
    }
    
}
