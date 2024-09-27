public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Métodos de Ordenamiento");
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        int[] arreglo = {10, 7, 12, 3};
        mO.sortBySeleccion(arreglo, true);
        mO.printArreglo(arreglo);
        System.out.println();
        mO.sortBySeleccion(arreglo, false);
        mO.printArreglo(arreglo);
        
    }
}
