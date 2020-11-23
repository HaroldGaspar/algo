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
public class Pregunta2 {
/*
    public static void main(String[] args) {


        //HABILITAR LA INTERFAZ TECLADO PARA EL INGRESO DE DATOS
        Scanner teclado = new Scanner(System.in);

        //Definir variables
        String nombres[] = new String[6];
        double ingresos[][] = new double[6][3];
        double ingresoVentasAcum[] = new double[6];

        //a) Realizar la carga de la información mencionada. 
        System.out.println("------------ REGISTRO DE ORGANIZACION Y VENTAS------------");
        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese nombre de la organización " + (i + 1));
            nombres[i] = teclado.next();
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese ventas del mes " + (j + 1) + " para la organización " + nombres[i]);
                ingresos[i][j] = teclado.nextDouble();
            }
        }

        //b) Generar un vector que contenga el ingreso acumulado de las ventas de cada uno de los
        //organizaciones en el último semestre del año para cada empleado
        System.out.println("----------- VECTOR CON SUELDOS ACUMULADOS ------------");
        for (int f = 0; f < 6; f++) {
            double valorAcumuladoAux = 0;
            for (int c = 0; c < 6; c++) {
                valorAcumuladoAux += ingresos[f][c];
            }
            ingresoVentasAcum[f] = valorAcumuladoAux;
        }

//Búsqueda secuencial

//c) Implementar el método de búsqueda secuencial en cual ingrese el nombre de la organización
//y muestre el monto acumulado en ventas por el primer trimestre

        String respuesta1;
        do {
            System.out.println("Desea buscar algún ingreso acumulado? (S/N)");
            respuesta1 = teclado.next();
            if (respuesta1.toUpperCase().equals("S")) {
                System.out.println("Qué organización desea buscar?");
                String respuesta = teclado.next();
                int flag = 0;
                for (int i = 0; i < 6; i++) {
                    if (respuesta.equals(nombres[i])) {
                        System.out.println("Ingreso acumulado para empresa " + nombres[i] + ": "
                                + ingresoVentasAcum[i]);
                        flag = 1;
                    }
                }
                if (flag == 0) {
                    System.out.println("No se encuentra la organización");
                }
            }
        } while (respuesta1.equals("N"));
//Ordenar datos ascendentemente

//d) Ordenar el vector de ventas acumulados de forma ascendente, tener en cuenta que se
//deberá de ordenar el vector de los nombres de forma paralela.

        for (int i = 0; i < 6 - 1; i++) {
            for (int j = 0; j < 6 - i - 1; j++) {
                if (ingresoVentasAcum[j + 1] < ingresoVentasAcum[j]) {
                    double aux = ingresoVentasAcum[j + 1];
                    ingresoVentasAcum[j + 1] = ingresoVentasAcum[j];
                    ingresoVentasAcum[j] = aux;
                    String aux2 = nombres[j + 1];
                    nombres[j + 1] = nombres[j];
                    nombres[j] = aux2;
                }
            }
        }
        //Mostrar la organización con mayor ingreso acumulado
        System.out.println("La organización con mayor ingreso es " + nombres[5] + " con: "
                + ingresoVentasAcum[5]);


//    e) Implementar el método de búsqueda binaria en cual ingrese el nombre de la organización y
//muestre el monto acumulado en ventas por el primer trimestre.
        // Paso1, ordenar el vector en base a sus nombres
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length - 1 - i; j++) {
                String aux;
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                    double num;
                    num = ingresoVentasAcum[j];
                    ingresoVentasAcum[j] = ingresoVentasAcum[j + 1];
                    ingresoVentasAcum[j + 1] = num;
                }

            }
        }
        // Paso2 Implementar la busqueda binaria  
        // BUSQUEDA DE ELEMENTOS, BUSQUEDA BINARIA
        System.out.println("Busqueda binaria de elementos");
        System.out.println("Ingresa la organización a buscar en el arreglo");
        String nombreABuscar = teclado.next();
        int IndInicial = 0;
        int IndFinal = nombres.length - 1;
        int IndCentral = (IndInicial + IndFinal) / 2;
        String ValCentral = nombres[IndCentral];
        boolean resultFlag = false;
        while (IndFinal >= IndInicial) {
            if (nombreABuscar.equalsIgnoreCase(ValCentral)) {
                resultFlag = true;
                break;
            } else {
                if (nombreABuscar.compareToIgnoreCase(ValCentral) > 0) {
                    IndInicial = IndCentral + 1;
                    IndCentral = (IndInicial + IndFinal) / 2;
                    ValCentral = nombres[IndCentral];
                } else {
                    IndFinal = IndCentral - 1;
                    IndCentral = (IndInicial + IndFinal) / 2;
                    ValCentral = nombres[IndCentral];
                }
            }
        }
        if (resultFlag) {
            System.out.println("Monto de ventas es: " + ingresoVentasAcum[IndCentral]);
        } else {
            System.out.println("No encontro la organizacion establecida");
        }
    }
*/

        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int venta, sumaTotal=0;
            String organizaciones[] = {"ABC","BDE","DEF", "EFG","FGH", "GHI"};
            int[][] ventas = new int[6][3];
            int[] ventasAc = new int[6];
            for(int i=0; i<organizaciones.length;i++){
                System.out.println("---Ingrese las ventas trimestrales de : " + organizaciones[i]);
                int acu = 0;
                for (int j = 0; j < ventas[0].length; j++){
                    System.out.print("mes "+ (j+1) + " : ");
                    venta = sc.nextInt();
                    ventas[i][j] = venta;//asignar sueldos a matriz
                    acu += venta;//calcular acumulado
                }
                ventasAc[i] = acu;//definir vector de acumulados
            }
        /*
        System.out.println("---VENTAS ACUMULADAS DE EMPRESAS: ");
        for (int i = 0; i < ventas.length; i++){
        System.out.println(organizaciones[i]+" ha acumulado ventas de:" + ventasAc[i]);
        }
        */
            sc.nextLine();
            System.out.println("BUSCAR MONTO ACUMULADO POR ORG: ");
            String org = sc.nextLine();
            for (int j = 0; j < organizaciones.length; j++){
                if (organizaciones[j].equals(org)){
                    System.out.println("Monto acumulado: "+ ventasAc[j]);
                    break;
                }
            }
            for(int i=0;i<ventasAc.length;i++){
                for (int j = 0; j < ventasAc.length -1-i; j++){
                    int auxiliar;
                    String aux;
                    if (ventasAc[j]>ventasAc[j+1]){
                        auxiliar = ventasAc[j];
                        ventasAc[j] = ventasAc[j+1];
                        ventasAc[j+1] = auxiliar;
                        aux = organizaciones[j];
                        organizaciones[j] = organizaciones[j+1];
                        organizaciones[j+1] = aux;
                    }
                }
            }
        /*System.out.println("---EMPRESAS ORDENADAS POR VENTAS ACUMULADAS: ");
        for (int i = 0; i < ventas.length; i++){
        System.out.println(organizaciones[i]+" ha acumulado ventas de:" + ventasAc[i]);
        }*/
        //busqueda binaria
            int inicio=0, fin = organizaciones.length-1;
            int centro = (inicio + fin) /2;
            String valorM = organizaciones[centro];
            System.out.println("Inserte la empresa a buscar");
            String empresaABuscar = sc.nextLine();
            while(fin>=inicio){
                if (valorM.equals(empresaABuscar)){
                    System.out.println("Se encontro mediante Bbinaria la empresa "+organizaciones[centro] +"con ventasAc de: "+ ventasAc[centro]);
                    break;
                }else{
                    if (empresaABuscar.compareToIgnoreCase(organizaciones[centro])>0){
                        inicio = centro+1;
                        centro = (inicio + fin) /2;
                        valorM = organizaciones[centro];
                    }else{
                        fin = centro -1;
                        centro = (inicio + fin) /2;
                        valorM = organizaciones[centro];
                    }
                }
            }
        }

}

