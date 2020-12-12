import grafo.Arista;
import grafo.Mapa;
import grafo.Tienda;
import pila.Vendedor;
import pila.Vendedores;

import java.util.ArrayList;
import java.util.List;

public class TestQueuePileGraph {

    public static void main(String[] args) {

        System.out.println("/////////////\n TEST GRAPH \n/////////////");

        //--
        Tienda lima = new Tienda("Lima");
        Tienda ica = new Tienda("Ica");
        Tienda arequipa = new Tienda("Arequipa");
        Tienda tacna = new Tienda("Tacna");
        Tienda cuzco = new Tienda("Cuzo");
        Tienda laLibertad = new Tienda("La Libertad");
        Tienda piura = new Tienda("Piura");
        Tienda ancash = new Tienda("Ancash");

        Arista aristaLimaIca = new Arista(lima, ica, 200.0);
        Arista aristaLimaArequipa = new Arista(lima, arequipa, 60.0);
        Arista aristaLimaTacna = new Arista(lima, tacna, 110.0);
        Arista aristaLimaCuzco = new Arista(lima, cuzco, 300.0);
        Arista aristaLimaLaLibertad = new Arista(lima, laLibertad, 100.0);
        Arista aristaLimaPiura = new Arista(lima, piura, 150.0);
        Arista aristaLimaAncash = new Arista(lima, ancash, 90.0);

        Arista aristaIcaArequipa = new Arista(lima, ancash, 90.0);
        Arista aristaIcaTacna = new Arista(lima, ancash, 80.0);
        Arista aristaIcaCuzco = new Arista(lima, cuzco, 280.0);
        Arista aristaIcaLaLibertad = new Arista(lima, laLibertad, 120.0);
        Arista aristaIcaPiura = new Arista(lima, piura, 170.0);
        Arista aristaIcaAncash = new Arista(lima, ancash, 70.0);

        lima.setAristas(aristaLimaIca);
        lima.setAristas(aristaLimaArequipa);
        lima.setAristas(aristaLimaTacna);
        lima.setAristas(aristaLimaCuzco);
        lima.setAristas(aristaLimaLaLibertad);
        lima.setAristas(aristaLimaPiura);
        lima.setAristas(aristaLimaAncash);

        ica.setAristas(aristaIcaArequipa);
        ica.setAristas(aristaIcaTacna);
        ica.setAristas(aristaIcaCuzco);
        ica.setAristas(aristaIcaLaLibertad);
        ica.setAristas(aristaIcaPiura);
        ica.setAristas(aristaIcaAncash);
        //--

        Mapa mapa = new Mapa();
        mapa.setTienda(lima);
        mapa.setTienda(ica);
        mapa.setTienda(arequipa);
        mapa.setTienda(tacna);
        mapa.setTienda(cuzco);
        mapa.setTienda(laLibertad);
        mapa.setTienda(piura);
        mapa.setTienda(ancash);

        System.out.println("====================== tiendas ===========================");
        List<Tienda> tiendas = mapa.getTiendas();

        for (Tienda tienda : tiendas) {
            System.out.println("" + tienda);
        }
        /*
            END TEST GRAPH
         */
        System.out.println("/////////////\n TEST PILE \n/////////////");
        System.out.println("====================== push pilaVendedores ===========================");

        Tienda limaMap = mapa.getTiendas().get(0);

        Vendedores pilaVendedores = new Vendedores(5);

        System.out.println("Is pile empty: " + pilaVendedores.isEmpty());

        pilaVendedores.push(new Vendedor(1, "Pepe", "Pepe", "456123", "mail@mail.com", 51.2, 51, limaMap));
        pilaVendedores.push(new Vendedor(2, "Sorano", "Sorano", "456123", "mail@mail.com", 50.3, 50, limaMap));
        pilaVendedores.push(new Vendedor(3, "Vargas", "Calderon", "456123", "mail@mail.com", 20.2, 53, limaMap));
        pilaVendedores.push(new Vendedor(4, "Pepe", "Borges", "456123", "mail@mail.com", 40.3, 40, limaMap));
        pilaVendedores.push(new Vendedor(5, "Kevin", "Karlos", "456123", "mail@mail.com", 80.9, 60, limaMap));

        System.out.println("====================== peek ===========================");
        Vendedor peekPila = pilaVendedores.peek();
        if (peekPila != null)
            System.out.println("" + peekPila.getNombre());//MUST RETURN 'Kevin'


        System.out.println("====================== pop & peek ===========================");
        //System.out.println(productos.getCima());;// UNA VEZ EJECUTA Y POPEADO NO SE PUEDE REPETIR EL SCRIPT => PROBELMA CON EL IDENTITY
        pilaVendedores.pop();

        peekPila = pilaVendedores.peek();
        if (peekPila != null)
            System.out.println("cima de la pila: " + peekPila.getNombre());//MUST PRINT 'Pepe'

        System.out.println("====================== print objects from pile./ ===========================");
        Vendedor[] vendedors = pilaVendedores.elementos();
        if (peekPila != null) {//si la pila no esta vacia
            for (Vendedor vendedor : vendedors) {
                if (vendedor == null)//si un elemento de la pila tiene asignado un null
                    continue;
                else
                    System.out.println(vendedor.toString());
            }
        }
        /*

            END TEST PILE

         */

        System.out.println("/////////////\n TEST COLA \n/////////////");

        Tienda icaMap = mapa.getTiendas().get(1);

        cola.Vendedores colaVendedores = new cola.Vendedores();
        System.out.println("Is queue empty: " + colaVendedores.isEmpty());

        colaVendedores.offer(new cola.Vendedor(1, "CarlosJ", "Carlos", "84561234", "mail@mail.com", 31.2, 11, icaMap));
        colaVendedores.offer(new cola.Vendedor(2, "JuanJ", "Juan", "84561234", "mail@mail.com", 30.2, 14, icaMap));
        colaVendedores.offer(new cola.Vendedor(3, "AlbertoJ", "Alberto", "84561234", "mail@mail.com", 32.2, 15, icaMap));

        System.out.println("====================== peek ===========================");
        cola.Vendedor peekCola = colaVendedores.peek();//PRIMERO
        if (peekCola != null)
            System.out.println("primero de la cola: " + peekCola.getNombre());//MUST RETURN 'CarlosJ'

        System.out.println("====================== pop & peek ===========================");
        colaVendedores.poll();

        peekCola = colaVendedores.peek();//PRIMERO
        if (peekCola != null)
            System.out.println("primero: " + peekCola.getNombre());//MUST PRINT 'JuanJ'

        System.out.println("====================== print objects from queue./ ===========================");
        colaVendedores.print();

        /*

            END TEST QUEUE

         */

        System.out.println("/////////////\n REPORTE CON VECTORES PARALELOS \n/////////////");

        //Cargar tiendas a un vector
        List<Tienda> tiendasList = mapa.getTiendas();
        String[] tiendasArr = new String[tiendasList.size()];
        for (int i = 0; i < tiendasList.size(); i++) {
            tiendasArr[i] = tiendasList.get(i).getNombre();
        }

        int ventas[][] = {{300,300,300},{400,400,400},{500,500,500},{600,600,600},{700,700,700},{800,800,800},{900,900,900},{1000,1000,1000}};

        //Generar vector de ventas acumuladas
        int ventasAc[] = new int[8];
        for(int i=0; i<tiendasArr.length;i++){
            int acu = 0;
            for (int j = 0; j < ventas[0].length; j++){
                int sueldo = ventas[i][j];
                acu += sueldo;//calcular acumulado
            }

            ventasAc[i] = acu;//definir vector de acumulados
        }

        //BUSQUEDA SECUENCIAL DE VENTASAC POR ORG
        /*DEFINIR ORG A BUSCAR*/
        String org = "Tacna";

        for (int j = 0; j < tiendasArr.length; j++){
            if (tiendasArr[j].equals(org)){
                System.out.println("Ventas acumulado de la tienda "+org+" : "+ ventasAc[j]);
                break;
            }
        }//MUST PRINT 1800

        //ORDENAMIENTO POR VENTASAC
        for(int i=0;i<ventasAc.length;i++){
            for (int j = 0; j < ventasAc.length -1-i; j++){
                int auxiliar;
                String aux;
                if (ventasAc[j]>ventasAc[j+1]){
                    auxiliar = ventasAc[j];
                    ventasAc[j] = ventasAc[j+1];
                    ventasAc[j+1] = auxiliar;

                    aux = tiendasArr[j];
                    tiendasArr[j] = tiendasArr[j+1];
                    tiendasArr[j+1] = aux;
                }
            }
        }
        System.out.println("imprimir vector ordenado POR VENTAS ACUMULADAS");
        for (int i = 0; i < tiendasArr.length; i++){
            System.out.print("-" +ventasAc[i]+": ");
            System.out.println(tiendasArr[i]);
        } //MUST PRINT 900, 1200, 1500, 1800, ...

        //BUSQUEDA BINARIA DE  VENTASAC POR NOMBRE DE ORG
        int inicio=0, fin = tiendasArr.length-1;
        int centro = (inicio + fin) /2;
        String valorM = tiendasArr[centro];

        while(fin>=inicio){
            if (valorM.equals(org)){
                System.out.println("Se encontro mediante Bbinaria la organizacion de "+tiendasArr[centro] +" con ventasAc de: "+ ventasAc[centro]);
                break;
            }else{
                if (org.compareToIgnoreCase(tiendasArr[centro])>0){
                    inicio = centro+1;
                    centro = (inicio + fin) /2;
                    valorM = tiendasArr[centro];

                }else{
                    fin = centro -1;
                    centro = (inicio + fin) /2;
                    valorM = tiendasArr[centro];
                }
            }
        }//MUST PRINT 1800

    }

}
