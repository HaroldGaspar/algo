package pe.isil.nueve.pilanombres;
    public class PilaNombres {
        private String nombres[];
        private int cantidadDeElementos;
        private int cima;


        public PilaNombres(int cantidadDeElementos){
            this.cantidadDeElementos = cantidadDeElementos;
            nombres = new  String[cantidadDeElementos];
            cima = 0;
        }

        public boolean isEmpty(){
            return (cima == 0)? true :false;
        }


        public void push(String nombre){
            if (cima<cantidadDeElementos){
                nombres[cima] = nombre;
                cima++;
            } else System.out.println("La pila ya esta llena");
        }


        public String peek() {
            return (cima == 0)? "there's nothing" : nombres[cima-1];
        }

        public void pop(){
            if (cima == 0) System.out.println("La pila es vacia");
            else {
                nombres[cima-1] = null;
                cima--;
            }
        }

        public String[] elementosPila1(){
            return (cima != 0)? nombres : null;
        }

        public void imprimir(){
            if (cima > 0){
                for (String nombre : nombres) {
                    System.out.println(nombre);
                }
            }else
                System.out.println("No hay elemetos en a pila");
        }
    }

