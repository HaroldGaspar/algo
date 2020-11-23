/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.perDos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pregunta1 {
/*
    public static void main(String[] args) {

        //HABILITAR LA INTERFAZ TECLADO PARA EL INGRESO DE DATOS
        Scanner teclado = new Scanner(System.in);

        //    Definir variables
        String nombre[] = new String[6];
        double sueldos[][] = new double[6][6];
        double sueldoAcum[] = new double[6];
        double valorSueldosAcumulados = 0;

        //a) Realizar la carga de la información mencionada. 
        System.out.println("------------ REGISTRO DE EMPLEADOS Y SUELDOS------------");
        for (int f = 0; f < 6; f++) {
            System.out.println("Ingrese nombre del empleado " + (f + 1));
            nombre[f] = teclado.next();
            for (int c = 0; c < 6; c++) {
                System.out.println("Ingrese sueldo del mes " + (f + 1) + " para el empleado " + (c + 1));
                sueldos[f][c] = teclado.nextDouble();
            }
        }

        //b) Generar un vector que contenga el ingreso acumulado de los sueldos de cada uno de los
        //empleados en el último semestre del año para cada empleado
        System.out.println("----------- VECTOR CON SUELDOS ACUMULADOS ------------");
        for (int f = 0; f < 6; f++) {
            double valorAcumuladoAux = 0;
            for (int c = 0; c < 6; c++) {
                valorAcumuladoAux += sueldos[f][c];
            }
            sueldoAcum[f] = valorAcumuladoAux;
        }
        //c) Mostrar por pantalla el total pagado en sueldos a todos los empleados  
        System.out.println("----------TOTAL DE SUELDOS--------------");
        for (int i = 0; i < 6; i++) {
            valorSueldosAcumulados += sueldoAcum[i];
        }

        //d) Ordenar el vector de ingresos acumulados de forma ascendente, tener en cuenta que se
        //   deberá de ordenar el vector de los nombres de forma paralela.
        System.out.println("-------------ORDENAR DE FORMAS ASCENDENTE ------------");
        for (int i = 0; i < 6 - 1; i++) {
            for (int j = 0; j < 6 - i - 1; j++) {
                if (sueldoAcum[j + 1] < sueldoAcum[j]) {
                    double aux = sueldoAcum[j + 1];
                    sueldoAcum[j + 1] = sueldoAcum[j];
                    sueldoAcum[j] = aux;
                    String aux2 = nombre[j + 1];
                    nombre[j + 1] = nombre[j];
                    nombre[j] = aux2;
                }
            }
        }
        //e) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado.
        //Mostrar empleado con mayor sueldo acumulado        
        System.out.println("El empleado con mayor ingreso es:");
        System.out.println("" + nombre[5] + " con: " + sueldoAcum[5]);

    }
*/
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo, sumaTotal=0;
        String[] empleados = new String[6];
        int[][] sueldos = new int[6][6];
        int[] sueldosAc = new int[6];

        System.out.println("Inserte el nombre de los empleado: ");
        for(int i=0; i<empleados.length;i++){
            empleados[i] = sc.nextLine();
        }
        for(int i=0; i<empleados.length;i++){
            System.out.println("---Ingrese los sueldos de: " + empleados[i]);
            int acu = 0;
            for (int j = 0; j < sueldos.length; j++){
                System.out.print("mes "+ j + " : ");
                sueldo = sc.nextInt();
                sueldos[i][j] = sueldo;//asignar sueldos a matriz
                acu += sueldo;//calcular acumulado
            }
            sueldosAc[i] = acu;//definir vector de acumulados
        }
        System.out.println("---SUELDOS ACUMULADOS DE EMPLEADOS: ");
        for (int i = 0; i < empleados.length; i++){
            System.out.println(empleados[i]+" : Sueldo acumulado: " + sueldosAc[i]);
            sumaTotal += sueldosAc[i];//calcular suma total
        }
        System.out.println("---TOTAL PAGADOS A EMPLEADOS: " + sumaTotal);

        for(int i=0;i<sueldosAc.length;i++){
            for (int j = 0; j < sueldosAc.length -1-i; j++){
                int auxiliar;
                String aux;
                if (sueldosAc[j]>sueldosAc[j+1]){
                    auxiliar = sueldosAc[j];
                    sueldosAc[j] = sueldosAc[j+1];
                    sueldosAc[j+1] = auxiliar;

                    aux = empleados[j];
                    empleados[j] = empleados[j+1];
                    empleados[j+1] = aux;
                }
                if (i ==1 && j==0){
                    System.out.println("El empleado con mayor sueldo acumulado es:"+empleados[sueldosAc.length-1]);
                }
            }
        }

        /*
            for (int j = 0; j < sueldosAc.length -1; j++){
                int auxiliar;
                String aux;
                if (sueldosAc[j]>sueldosAc[j+1]){
                    auxiliar = sueldosAc[j];
                    sueldosAc[j] = sueldosAc[j+1];
                    sueldosAc[j+1] = auxiliar;
                    aux = empleados[j];
                    empleados[j] = empleados[j+1];
                    empleados[j+1] = aux;
                }
            }
        System.out.println("El empleado con mayor sueldo acumulado es:"+empleados[sueldosAc.length-1]);
            */

        System.out.println("VECTOR ORDENADO ASCENDENTEMENTE POR SUELDOS ACUMULADOS");
        for (int i = 0; i < empleados.length; i++){
            System.out.println("-" +empleados[i]+": " + sueldosAc[i]);
            if (i==empleados.length-1)
                System.out.println("El empleado con mayor sueldo acumulado es: "+empleados[i]);
        }
    }

}
