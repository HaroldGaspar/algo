import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Supplier s1 = new Supplier(25, "Drachenblut", "Sweden", "3485-252");
        Supplier s2 = new Supplier(15, "Rattlesnake", "Australia", "6154-198");
        Supplier s3 = new Supplier(35, "Old World", "Australia", "1526-241");
        Supplier s4 = new Supplier(10, "Grandma Kelly", "USA", "3774-96");
        Supplier s5 = new Supplier(20, "Gai Pâturage", "France", "4927-69");
        Supplier s6 = new Supplier(30, "Vaffeljernet", "Germany", "2425-161");
        Supplier s7 = new Supplier(40, "Bigfoot", "Austria","7465-37");
        Supplier s8 = new Supplier(12, "a", "b","7465-37");
        Supplier s9 = new Supplier(37, "b", "b","7465-37");
        Supplier s10 = new Supplier(32, "c", "b","7465-37");

        Tree tree = new Tree();
/*
        System.out.println("Esta vacio: "+ tree.esVacio()+" - Es hoja: "+tree.esHoja());
        tree.insertar(s1);
        System.out.println("Esta vacio: "+ tree.esVacio()+" - Es hoja: "+tree.esHoja());
        tree.insertar(s2);
        System.out.println("Esta vacio: "+ tree.esVacio()+" - Es hoja: "+tree.getLeft().esHoja());
*/

        //Arrays.asList(e1,e2,e3,e4,e5,e6).forEach(e->bst.insertar(e));
        Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9).forEach(tree::insertar);
        //Arrays.asList(s4,s8,s2,s5,s1,s6,s3,s9,s7).forEach(tree::insertar);
        /*localizar(tree, 20);
        localizar(tree, 1);*/

//        System.out.println(tree.getById(20));
//        System.out.println(tree.getById(1));
        System.out.println("==============\n In Orden \n==============");
        tree.inorden();
        System.out.println("==============\n In Orden \n==============");
        tree.eliminar(35);
        tree.inorden();

//        System.out.println("==============\n Pre Orden \n==============");
//        tree.preorden();

//        System.out.println("==============\n In Orden \n==============");
//        tree.inorden();

//        System.out.println("==============\n Post Orden \n==============");
//        tree.postorden();

    }
/*
    private static void localizar(Tree tree, int id){
        if (tree.existe(id)) {
            System.out.println(tree.obtener(id));
        } else {
            System.out.println("No encuentro el empleado " + id);
        }
    }
*/

}
