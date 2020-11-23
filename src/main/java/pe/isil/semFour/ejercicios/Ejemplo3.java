/*
Cargar en un vector los nombres de 4 continentes y 
en otro vector paralelo la cantidad de habitantes del mismo. 
Ordenar alfabéticamente e imprimir los resultados. 7
Por último ordenar con respecto a la cantidad de habitantes 
(de mayor a menor) e imprimir nuevamente.
 */
package pe.isil.semFour.ejercicios;

/**
 *
 * @author User
 */
public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        String continentes[]= {"America","Oceania","Europa","Asia"};
        double poblaciones[]={500,200,600,1200};

        //Ordenando los vectores alfabeticamente
        for (int i = 0; i < continentes.length; i++) {
            for (int j = 0; j < continentes.length-i-1; j++) {
                 String auxNombre;
                 double auxPoblacion;
                if (continentes[j].compareToIgnoreCase(continentes[j+1])>0) {   
                    auxNombre=continentes[j];
                    continentes[j]=continentes[j+1];
                    continentes[j+1]=auxNombre;
                    
                    auxPoblacion = poblaciones[j];
                    poblaciones[j]=poblaciones[j+1];
                    poblaciones[j+1]=auxPoblacion;                   
                }              
            }
        }
        
        System.out.println("Imprimiendo los valores ordenados");
        for (int i = 0; i < continentes.length; i++) {
            System.out.println("Continente :"+continentes[i]+" Poblacion :"+poblaciones[i]);
        }
        
        
    }
    
}
