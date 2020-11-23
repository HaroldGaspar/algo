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
public class EjemploCaracteres2 {
    public static void main(String[] args) {
        
        String nombres[] = {"Sebastian","Zuan Carlos","Aldair","Fiorella"};
        
        //Ordenar la lista de forma alfábetica
        
        for (int i = 0; i <nombres.length; i++) {
            for (int j = 0; j < nombres.length-1-i; j++) { 
                String aux;
                if (nombres[j].compareToIgnoreCase(nombres[j+1])>0) {
                    aux = nombres[j];
                    nombres[j]=nombres[j+1];
                    nombres[j+1]= aux;
                }
            }
        }
        
        System.out.println("Imprimir vector ordenado");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("-"+nombres[i]);
        }
        
        
        
        
        
    }
    
}
