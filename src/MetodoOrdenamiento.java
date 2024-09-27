public class MetodoOrdenamiento {
 
    public int[] sortBySeleccion(int[] arreglo, boolean ascendente){
        int tamanio = arreglo.length;

        //Recorrer arreglo
        for(int i = 0; i < tamanio; i++){
            int indice = i;
            for(int j = i + 1; j < tamanio; j++){
                if (ascendente? arreglo[j] < arreglo[indice] : arreglo[j] > arreglo[indice]){
                        indice = j;   
                    
                }     
                 
            }
            // Intercamnio del indice encontrado por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;          
        }
        return arreglo;
    }
    public void printArreglo (int[] arreglo){
        for(int elemento : arreglo){
            System.out.println(elemento + ", ");
        }

    }
}
