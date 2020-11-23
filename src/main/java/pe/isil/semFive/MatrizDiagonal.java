/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.isil.semFive;

/**
 *
 * @author User
 */
public class MatrizDiagonal {

    public static void main(String[] args) {

        // Generar una matriz escalar  de 5X5 donde los elemento
        // de la diagonal principal son iguales a 7
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 7;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
         // IMPRESION DE LOS ELEMENTOS DE LA MATRIZ POR FILAS
        System.out.println("Los valores de la MATRIZ por fila-columna son :");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (c == matriz[0].length - 1) {
                    System.out.println(matriz[f][c]);
                } else {
                    System.out.print(matriz[f][c] + "-");
                }
            }
            System.out.println("");
        }

    }
}
