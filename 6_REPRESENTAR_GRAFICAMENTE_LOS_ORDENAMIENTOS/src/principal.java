/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jofie
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    //METODO PARA INTERCAMBIAR LOS VALORES EN LOS ARRAY

    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
    }

    //METODO DE ORDENAMIENTO SELECTION SORT
    public static void selectionSort(int[] Arreglo) {
        for (int i = 0; i < Arreglo.length; i++) {
            int min = Arreglo[i];
            int pM = i;
            for (int j = i + 1; j < Arreglo.length; j++) {
                if (Arreglo[j] < min) {
                    min = Arreglo[j];
                    pM = j;
                }
            }
            Arreglo[pM] = Arreglo[i];
            Arreglo[i] = min;
        }
    }

    //METODO DE ORDENAMIENTO INSERTION
    public static void insertionSort(int[] a) {
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {

            /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
            posicion correcta del elemento destino*/
            j = i;
            aux = a[i];

            // se localiza el punto de inserción explorando hacia abajo
            while (j > 0 && aux < a[j - 1]) {

                // desplazar elementos hacia arriba para hacer espacio
                a[j] = a[j - 1];
                j--;
            }

            a[j] = aux;
        }
    }

    //METODO DE ORDENAMIENTO QUICK
    public static void quickSort(int a[]) {
        quick(a, 0, a.length - 1);
    }

    private static void quick(int a[], int primero, int ultimo) {
        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = a[central];
        i = primero;
        j = ultimo;

        do {
            while (a[i] < pivote) {
                i++;
            }
            while (a[j] > pivote) {
                j--;
            }
            if (i <= j) {
                intercambiar(a, i, j);
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quick(a, primero, j); // mismo proceso con sublista izqda
        }

        if (i < ultimo) {
            quick(a, i, ultimo); // mismo proceso con sublista drcha
        }
    }
}
