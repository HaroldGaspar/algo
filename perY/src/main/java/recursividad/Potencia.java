package recursividad;

public class Potencia {
    public Integer potenciar(int base, int potencia){
        if (potencia == 0){
            return 1;
        }
        return base * potenciar( base ,potencia - 1);
    }
}
