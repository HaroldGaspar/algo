public class Tree {

    private Supplier valor;
    private Tree left, right;
    private Tree padre;

    //reference to exist()
    public Supplier getById(int id) {
        if (valor != null){
            if (id == valor.getId()){
                return valor;
            } else if (id < valor.getId() && left != null){
                return left.getById(id);
            } else if (id > valor.getId() && right != null){
                return right.getById(id);
            }else {
                return null;
            }
        } else {
            return null;
        }
    }

    //=================================================

    public void insertar(Supplier sup){
        insertarImpl(sup, null);// primer caso sin padre
    }

    private void insertarImpl(Supplier sup, Tree padre) {//rastrear el padre para la eliminacion
        if (valor == null){
            this. valor = sup;
            this.padre = padre;
        } else {
            if (sup.compareTo(valor)<0){//si el empleado es menor al padre actual
                if (left == null) left = new Tree();//evitar NPE
                left.insertarImpl(sup, this);//recursivo
            } else if (sup.compareTo(valor)>0){
                if (right == null) right = new Tree();
                right.insertarImpl(sup, this);
            } else {//duplicado
                throw new RuntimeException("Insertando elemento duplicado");
            }
        }
    }

    //=================================================

    public void preorden(){
        preordenImpl("");
    }

    private void preordenImpl(String prefijo) {
        if (valor != null) {
            System.out.println(prefijo + valor);//impl inden
            if (left != null) left.preordenImpl(prefijo + "  ");//mientras mas profundo mas indent
            if (right != null) right.preordenImpl(prefijo + "  ");// " "
        }
    }

    public void inorden() {
        inordenImpl("");
    }

    private void inordenImpl(String prefijo) {
        if (valor != null) {
            if (left != null) left.inordenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
            if (right != null) right.inordenImpl(prefijo + "  ");
        }
    }

    public void postorden() {
        postordenImpl("");
    }

    private void postordenImpl(String prefijo) {
        if (valor != null) {
            if (left != null) left.postordenImpl(prefijo + "  ");
            if (right != null) right.postordenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
        }
    }

    //=================================================

    public void eliminar(int id) {
        if (valor != null) {
            if (id == valor.getId()){//encontrado
                eliminarImpl(id);//IMPL
            } else if (id < valor.getId() && left != null){
                left.eliminar(id);//recursivo
            } else if (id > valor.getId() && right != null){
                right.eliminar(id);
            }
        }
    }

    private void eliminarImpl(int id){

        if(right != null && right != null){//2 hijos
            Tree minimo = right.minimo();
            //remplazamos el nodo con el minimo
            this.valor = minimo.valor;
            right.eliminar(minimo.valor.getId());

        } else if (left != null || right != null){// 1 hijo
            Tree sustituto = left != null ? left : right;//quien es el hijo?
            //remplazamos el nodo con su hijo
            this.valor = sustituto.valor;
            this.left = sustituto.left;
            this.right = sustituto.right;

        } else {//hoja
            if (padre != null){
                if (this == padre.left) padre.left = null;
                if (this == padre.right) padre.right = null;
                padre = null; //ya no existo y ya no hay un padre mio
            } valor = null;
        }
    }

    private Tree minimo(){
        if (left != null && !left.esVacio()){
            return left.minimo();//recursivo
        } else {
            return this;// si no hay izquierdo, somos
        }
    }

    //=================================================

    //LOCALIZAR
    public boolean existe(int id) {
        if (valor != null){
            if (id == valor.getId()){
                return true;
            } else if (id < valor.getId() &&  left != null){//seguir buscando recursivamente
                return left.existe(id);
            } else if (id > valor.getId() && right != null){
                return right.existe(id);
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean esHoja() {
        return valor != null && left == null && right == null;
    }

    public boolean esVacio() {
        return valor == null;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }
}
