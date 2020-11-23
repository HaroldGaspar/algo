/*
Desarrollar un programa que permita ingresar un vector de 
n elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50.
El valor del vector lo define el usuario en tiempo de ejecución de la aplicación
 */
package pe.isil.semThreeFindAndOrder;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author User
 */
public class Problema1 {
    
    
    public static void main(String[] args) {
        
        Scanner teclado =  new Scanner(System.in);
        int tamañoArreglo;   
        double valorAcumulado=0;
        double valorAcumuladoMayor36=0;
        double cantidadValoresMayor50=0;
        double numeros[];
        double numeroABuscar;
        
        System.out.println("Ingrese la cantidad de elementos a procesar");
        tamañoArreglo = teclado.nextInt(); 
        numeros = new double[tamañoArreglo]; //5
        for (int i = 0; i < numeros.length  ; i++) {
            System.out.println("Ingresa el valor numero :"+(i+1));
            numeros[i]=teclado.nextDouble();
        }
        for (int i = 0; i < numeros.length; i++) {
            valorAcumulado += numeros[i];  
        }
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]>36){
            valorAcumuladoMayor36+=numeros[i];
            }
        }
        for (int i = 0; i <numeros.length; i++) {
            if(numeros[i]>50){
             cantidadValoresMayor50++;
            }
        }
        //Cual es el número mayor en el arreglo
         for (int j = 0; j < numeros.length-1; j++) {
                double auxiliar;
                if(numeros[j]>numeros[j+1]){
                   auxiliar = numeros[j];
                   numeros[j]=numeros[j+1];
                   numeros[j+1]=auxiliar;
                }
            }
        //Ordenar el arreglo
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length-1-i; j++) {
                double auxiliar;
                if(numeros[j]>numeros[j+1]){
                   auxiliar = numeros[j];
                   numeros[j]=numeros[j+1];
                   numeros[j+1]=auxiliar;
                }
            }
        }
        
        //Algoritmo de Busqueda Secuencial
        System.out.println("Ingresa el número a buscar");
        numeroABuscar = teclado.nextDouble();
        //Algoritmo de busqueda secuencial
        for (int i = 0; i < numeros.length; i++) {     
            if(numeroABuscar==numeros[i]){
                System.out.println("Se encontro el número en la posición :"+i);
                break;
            }         
        }
        
        //Algoritmo de busqueda binaria
        //Definiendo variables auxiliares
        //Indices y/o posiciones
        int inicio=0;
        int fin = numeros.length-1;
        int centro = (inicio+fin)/2;
        //Valores almacenados en el arreglo
        double valorCentro = numeros[centro];
        
        while(fin>=inicio){  
            if (valorCentro==numeroABuscar) {
                System.out.println("Se encontro el numero en la posición :"+centro);
                break;
            } else {
                if (numeroABuscar>valorCentro) {
                    inicio=centro+1;
                    centro=(inicio+fin)/2;
                    valorCentro= numeros[centro];
                } else {
                    fin = centro-1;
                    centro=(inicio+fin)/2;
                    valorCentro= numeros[centro];                
                }
            }

        }
     
        System.out.println("El valor acumulado es :"+valorAcumulado);
        System.out.println("El valor acumulado mayor a 36 es :"+valorAcumuladoMayor36);
        System.out.println("La cantidad de valores mayores a 50"+cantidadValoresMayor50);
    }
    
    
}
