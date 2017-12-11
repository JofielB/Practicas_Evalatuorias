
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jofiel
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean continuar = true;
        int dobleTiempo = compararTiempos();
        Scanner scan = new Scanner(System.in);
        System.out.println("Se usara QuickSort apartir de arreglos de tamaño: " + dobleTiempo +"\n");
        while(continuar){
            System.out.println("De que tamaño sera el arreglo que desea ordenar?");
            int tamaño = scan.nextInt();
            if(tamaño >= dobleTiempo ){
                porQuick(tamaño);
                /*//COMPROVACION DE QUE FUNCIONA ADECUADAMENTE EL PROGRAMA
                System.out.println("Con insertion hubiera durado");
                porInsertion(tamaño);*/
            }
            else{
                porInsertion(tamaño);
                /*//COMPROVACION DE QUE FUNCIONA ADECUADAMENTE EL PROGRAMA
                System.out.println("Con quick hubiera durado");
                porQuick(tamaño);*/
            }
            System.out.println("");
            System.out.println("Desea seguir ordenando arreglos? (si o no)");
            String respuesta = scan.next();
            if(respuesta.equals("no"))
                continuar = false;
        }
        System.out.println("Programa Terminado");
    }
    public static int compararTiempos() {
        long tiempoInsertion = 0;
        long tiempoQuick = 0;
        int tamañoArreglo = 9;
        long lIni;
        long lFin;
        do {
            tamañoArreglo ++;
            int arregloUno[] = new int[tamañoArreglo];
            int arregloDos[] = new int[tamañoArreglo];
            for (int j = 0; j < tamañoArreglo; j++) {
                int numRandom = (int) (Math.random() * 1000);
                arregloUno[j] = numRandom;
                arregloDos[j] = numRandom;
            }
            //CALCULAR TIEMPO DE INSERTION
            lIni = System.nanoTime();
            insertionSort(arregloUno);
            lFin = System.nanoTime();
            tiempoInsertion = lFin - lIni;
            
            //CALCULAR TIEMPO DE QUICK
            lIni = System.nanoTime();
            quickSort(arregloDos);
            lFin = System.nanoTime();
            tiempoQuick = lFin - lIni;
            
            /*
                10*2 -- 10
                8*2 -- 10
                5*2 -- 10
            */
   
        } while (tiempoQuick*2 > tiempoInsertion);
        return tamañoArreglo;
    }

    public static void porQuick(int a) {
        int arreglo[] = new int[a];
            for (int j = 0; j < a; j++) {
                arreglo[j] = (int) (Math.random() * 1000);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            quickSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo QuickSort en arreglo de tamaño " + a + " : " + tiempoTotal +" nanosegundos");
        
    }

    public static void porInsertion(int a) {
        int arreglo[] = new int[a];
     
            for (int j = 0; j < a; j++) {
                arreglo[j] = (int) (Math.random() * 1000);
            }
            imprimirArreglo(arreglo);
            long lIni = System.nanoTime();
            insertionSort(arreglo);
            long lFin = System.nanoTime();
            long tiempoTotal = lFin - lIni;
            imprimirArreglo(arreglo);
            System.out.println("Tiempo InsertionSort en arreglo de tamaño " + a + " : " + tiempoTotal + " nanosegundos");
        
    }

    public static void imprimirArreglo(int[] Arreglo) {
        for (int i : Arreglo) {
            System.out.print("[" + i + "]");
        }
        System.out.println("");
    }

    //METODO PARA INTERCAMBIAR LOS VALORES EN LOS ARRAY
    public static void intercambiar(int[] a, int i, int j) {
        int aux = a[i];
        a[i] = a[j];
        a[j] = aux;
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
