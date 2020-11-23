package pe.isil.parcial;

import java.util.Scanner;

public class Parcial {

    public static void main(String[] args) {
        ListaEnlazadaDoble listaDoble = new ListaEnlazadaDoble();
        listaDoble.agregarAlInicio(5);
        listaDoble.agregarAlInicio(7);
        listaDoble.agregarAlFinal(10);
        listaDoble.agregarAlFinal(15);
        listaDoble.modificarArea(2,7);
        listaDoble.mostrarListaEnlazadaInicioAFin();

        listaDoble.eliminarInicio();
        listaDoble.eliminarFin();

        listaDoble.mostrarListaEnlazadaInicioAFin();
        listaDoble.buscarTerreno(5);
    }




        /*
        listaDoble.agregarAlFinal(10);
        listaDoble.agregarAlFinal(24);
        listaDoble.agregarAlInicio(30);

    //listaDoble.mostrarListaEnlazadaInicioAFin();

        listaDoble.mostrarListaEnlazadaFinAInicio();
        listaDoble.buscarElemento(24);
    //listaDoble.eliminar(30);
        listaDoble.mostrarListaEnlazadaInicioAFin();
    //listaDoble.mostrarListaEnlazadaFinAInicio();

        System.out.println("Tamaño :"+listaDoble.tamaño());
    int tamaño = listaDoble.tamaño();
    ListaEnlazadaDoble listaDobleReplica = new ListaEnlazadaDoble();
        for (int i = 0; i < tamaño; i++) {
        //int indice = Math.random();
        listaDobleReplica.agregarAlInicio(listaDoble.obtenerDato(i));
    }

        listaDobleReplica.mostrarListaEnlazadaFinAInicio();
         listaDoble.mostrarListaEnlazadaInicioAFin();
*/






/*
    public static void main(String[] args) {

        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();

        lista.addFinal(30.6);
        lista.addFinal(20.6);
        lista.addFinal(10.6);
        lista.addFinal(5.6);

        lista.modificar(1,20.7);
        lista.recorrido();
        lista.eliminarInicio();
        lista.eliminarFin();
        System.out.println("-------delete");
        lista.recorrido();
        lista.ordenar();
        System.out.println("-------order");
        lista.recorrido();



    }
*/



/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo, fila, columna, sumafila=0, sumaColumna=0, diagonalP=0, diagonalI=0;
        double media, sumaTotal=0;
        int[][] sueldos = new int[4][4];


        for(int i=0; i<sueldos.length;i++){
            for (int j = 0; j < sueldos.length; j++){
                boolean flag = false;

                do {
                        System.out.print("---Ingrese el  sueldo (" + i + "," + j + ") : ");
                        sueldo = sc.nextInt();

                    if (sueldo>=930 && sueldo <=5000) {
                        sueldos[i][j] = sueldo;//asignar sueldos a matriz
                        sumaTotal += sueldo; //calcular total int -> double
                        flag = true;
                    }else {
                        System.out.println("Inserte un valor valido!!!!");
                    }
                }while (flag == false);
            }
        }

        System.out.print("---SUELDOS ACUMULADOS DE LA FILA: ");
        fila = sc.nextInt();
        for (int i=0; i<sueldos[0].length; i++) {
            sumafila += sueldos[fila-1][i];//no indice
        }
        System.out.println(sumafila);

        System.out.print("---SUELDOS ACUMULADOS DE LA COLUMNA: ");
        columna = sc.nextInt();
        for (int i=0; i<sueldos.length; i++)
            sumaColumna += sueldos[i][columna-1];//no indice
        System.out.println(sumaColumna);

        System.out.println("---SUMA DE DIAGONALES");
        for (int i=0; i<sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                if (i==j) {
                    diagonalP += sueldos[i][j];
                    diagonalI += sueldos[i][(sueldos.length-1)-j];
                }
            }
        }
        System.out.println("Suma de diagonal principal: "+diagonalP);
        System.out.println("Suma de diagonal inversa: "+diagonalI);

        //Ordenar
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[0].length; j++) {
                for (int k = 0; k < sueldos.length; k++) {
                    for (int l = 0; l < sueldos[0].length; l++) {
                        int auxiliar;
                        if (sueldos[i][j] < sueldos[k][l]) {
                            auxiliar = sueldos[i][j];
                            sueldos[i][j] = sueldos[k][l];
                            sueldos[k][l] = auxiliar;
                        }
                    }
                }
            }
        }
        media = sumaTotal/16;//double/int =>double

        System.out.println("---METRICAS");
        System.out.println("El mayor sueldo es: " + sueldos[3][3]);
        System.out.println("El menor sueldo es: "+sueldos[0][0]);
        System.out.println("La media de sueldos es: " + media);

    }
*/

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alumnos = new String[3];
        int[] notasAc = new int[alumnos.length];
        int[][] notas;
        int nota, nro, pares=0,acu,a=0,b=0;
        int[] notasPares, notasImpares;
        String alumno;

        //definir datos


        System.out.println("---Nombres: ");
        for(int i=0; i<alumnos.length;i++){
            System.out.print(i);
            alumnos[i] = sc.nextLine();
        }

        System.out.print("Inserte la cantidad de notas: ");
        nro = sc.nextInt();
        sc.nextLine();
        notas = new int[alumnos.length][nro];

        System.out.println("---Notas:");
        for(int i=0; i<alumnos.length ;i++){
            System.out.println("-----Ingrese las notas de " + alumnos[i] + " : ");
            acu =0;
            for (int j=0; j<notas[0].length;j++){
                boolean flag = false;

                do {
                    System.out.print("nota " +i+ j + ": ");
                    nota = sc.nextInt();
                    //System.out.println(notas[0].length + notas.length);
                    if (nota>=0 && nota <=20) {
                        notas[i][j] = nota;//asignar sueldos a matriz
                        flag = true;
                        acu += nota;
                    }else {
                        System.out.println("Inserte un valor valido!!!!");
                    }
                }while (flag == false);
            }
            sc.nextLine();
            notasAc[i] = acu;
        }

        //BURBUJA
        for (int i = 0; i < alumnos.length; i++) {
            for (int j = 0; j < alumnos.length-1-i; j++) {
                String auxiliar;
                if (alumnos[j].compareToIgnoreCase(alumnos[j + 1]) > 0) {
                    auxiliar = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = auxiliar;
                }
            }
        }

        //BINARIA
        int inicio=0;
        int fin = alumnos.length-1;
        int centro = (inicio + fin) /2;
        String valorM = alumnos[centro];

        System.out.println("Inserte alumno a buscar:");
        String alumnoABuscar = sc.nextLine();
        while(fin>=inicio){
            if (valorM.equals(alumnoABuscar)){
                System.out.println("Se encontro mediante Bbinaria a "+alumnos[centro]);
                break;
            }else{
                if (alumnoABuscar.compareToIgnoreCase(alumnos[centro])>0){
                    inicio = centro+1;
                    centro = (inicio + fin) /2;
                    valorM = alumnos[centro];
                }else{
                    fin = centro -1;
                    centro = (inicio + fin) /2;
                    valorM = alumnos[centro];
                }
            }
        }


        System.out.println("Los valores del vector alumnos son :");
        for (int f = 0; f < alumnos.length; f++) {
                if (f == alumnos.length - 1) {
                    System.out.println(alumnos[f]);
                } else {
                    System.out.print(alumnos[f] + "-");
                }
        }

        System.out.println("Los valores del vector notasAc son :");
        for (int f = 0; f < notasAc.length; f++) {
            if (f == notasAc.length - 1) {
                System.out.println(notasAc[f]);
            } else {
                System.out.print(notasAc[f] + "-");
            }
        }

        System.out.println("Los valores de la MATRIZ notas son :");
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                if (c == notas[0].length - 1) {
                    System.out.println(notas[f][c]);
                } else {
                    System.out.print(notas[f][c] + "-");
                }
            }
        }

        //BURBUJA
        for (int i = 0; i < notasAc.length; i++) {
            for (int j = 0; j < notasAc.length-1-i; j++) {
                String aux;
                int auxiliar;
                if(notasAc[j]>notasAc[j+1]){
                    auxiliar = notasAc[j];
                    notasAc[j]=notasAc[j+1];
                    notasAc[j+1]=auxiliar;

                    aux = alumnos[j];
                    alumnos[j]=alumnos[j+1];
                    alumnos[j+1]=aux;
                }
            }
        }
        System.out.println("Ordenamiento ascendente :");
        for (int f = 0; f < alumnos.length; f++) {
                System.out.println(alumnos[f] +" nota:"+ notasAc[f]);
        }

        //BURBUJA
        for (int i = 0; i < notasAc.length; i++) {
            for (int j = 0; j < notasAc.length-1-i; j++) {
                String aux;
                int auxiliar;
                if(notasAc[j]<notasAc[j+1]){
                    auxiliar = notasAc[j];
                    notasAc[j]=notasAc[j+1];
                    notasAc[j+1]=auxiliar;

                    aux = alumnos[j];
                    alumnos[j]=alumnos[j+1];
                    alumnos[j+1]=aux;
                }
            }
        }
        System.out.println("Ordenamiento descendente :");
        for (int f = 0; f < alumnos.length; f++) {
            System.out.println(alumnos[f] +" nota:"+ notasAc[f]);
            if (notasAc[f]%2==0){
                pares++;//calcular pares
            }
        }
        notasPares = new int[pares];
        notasImpares = new int[notasAc.length-pares];
        for (int f = 0; f < notasAc.length; f++) {
            if (notasAc[f]%2==0){
                notasPares[a]= notasAc[f];
                System.out.println(alumnos[f]+" obtuvo una nota par: "+ notasAc[f]);
                a++;
            }else {
                notasImpares[b]= notasAc[f];
                System.out.println(alumnos[f]+" obtuvo una nota impar: "+ notasAc[f]);
                b++;
            }
        }

    }

     */


}
