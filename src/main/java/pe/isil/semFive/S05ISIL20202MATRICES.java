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
public class S05ISIL20202MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edades[][] = new int[3][4];

        //INGRESAR DATOS A LA MATRIZ
        for (int f = 0; f < edades.length; f++) {
            for (int c = 0; c < edades[0].length; c++) {
                System.out.println("Ingresa el valor de la fila " + f + " la columna :" + c);
                edades[f][c] = teclado.nextInt();
            }
        }

        // IMPRESION DE LOS ELEMENTOS DE LA MATRIZ POR FILAS
        System.out.println("Los valores de la MATRIZ por fila-columna son :");
        for (int f = 0; f < edades.length; f++) {
            for (int c = 0; c < edades[0].length; c++) {
                if (c == edades[0].length - 1) {
                    System.out.println(edades[f][c]);
                } else {
                    System.out.print(edades[f][c] + "-");
                }
            }
            System.out.println("");
        }
        //IMPRESION DE LOS ELEMENTOS DE LA MATRIZ POR COLUMNAS
        System.out.println("Los valores de la MATRIZ por columna-fila son");
        for (int c = 0; c < edades[0].length; c++) {
            for (int f = 0; f < edades.length; f++) {
                if (f == edades.length - 1) {
                    System.out.print(edades[f][c]);
                } else {
                    System.out.print(edades[f][c] + "-");
                }
            }
            System.out.println("");
        }
        //ALGORITMO PARA LA BUSQUEDA DE UN ELEMENTO EN LA MATRIZ
        int edad = 30;

        for (int f = 0; f < edades.length; f++) {
            for (int c = 0; c < edades[0].length; c++) {
                if (edades[f][c] == edad) {
                    System.out.println("Se encontro el valor en la fila : " + f + " La columna: " + c);
                    break;
                }
            }
        }

        //ALGORITMO DE ORDENAMIENTO DE FORMA ASCENDENTE
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[0].length; j++) {
                for (int k = 0; k < edades.length; k++) {
                    for (int l = 0; l < edades[0].length; l++) {
                        int auxiliar;
                        if (edades[i][j] < edades[k][l]) {
                            auxiliar = edades[i][j];
                            edades[i][j] = edades[k][l];
                            edades[k][l] = auxiliar;
                        }
                    }
                }
            }
        }

        System.out.println("Los valores de la MATRIZ por fila-columna son :");
        for (int f = 0; f < edades.length; f++) {
            for (int c = 0; c < edades[0].length; c++) {
                if (c == edades[0].length - 1) {
                    System.out.println(edades[f][c]);
                } else {
                    System.out.print(edades[f][c] + "-");
                }
            }
            System.out.println("");
        }

    }

}
