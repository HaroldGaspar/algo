package pe.isil.nueve.pilaobjetos;

public class PilaAlumnos {
    private Alumno alumnos[];
    private int cantidadDeElementos;
    private int cima;

    public PilaAlumnos(int cantidadDeElementos) {
        this.cantidadDeElementos = cantidadDeElementos;
        alumnos = new Alumno[cantidadDeElementos];
        cima = 0;
    }
    public boolean isEmpty(){
        return (cima == 0)? true :false;
    }

    public void push(Alumno alumno){
        if (cima<cantidadDeElementos){
            alumnos[cima] = alumno;
            cima++;
        } else System.out.println("La pila ya esta llena");
    }

    public Alumno peek() {
        return (cima == 0)? new Alumno(null,"null",null,null,null) : alumnos[cima-1];
    }

    public void pop(){
        if (cima == 0) System.out.println("La pila es vacia");
        else {
            alumnos[cima-1] = null;
            cima--;
        }
    }

    public Alumno[] elementosPila(){
        return (cima != 0)? alumnos : null;
    }
//==================================== DRAMA  ===============================================
    public void imprimir(){
        if (cima > 0){
            for (Alumno alumno : alumnos){
                if (alumno == null) break;
                else System.out.println(alumno.getNombre());
            }

            //for (int i=0; i <cima ;i++) System.out.println(alumnos[i].getNombre());

        }else
            System.out.println("No hay elemetos en a pila");
    }
//==================================== DRAMA  ===============================================

    public Alumno[] getAlumnos() {
        return alumnos;
//        for (Alumno alumno : alumnos) {
//            System.out.println(alumno.getNombre());
//        }
    }
}
