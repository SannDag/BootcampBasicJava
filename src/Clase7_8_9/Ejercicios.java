package Clase7_8_9;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Ejercicios {

    public static void main(String[] args) {

        //public static String reverse(String texto) { }//
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        System.out.println("Cadena 'Hola mundo' al revés: " + reverse("Hola mundo"));
        System.out.println("\n");

        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("Array unidimensional: ");
        String[] nombres = {"Jony", "Roberto", "Lucas", "Diego"};
        for (String index : nombres) {
            System.out.println(index);
        }
        System.out.println("\n");

        // Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        System.out.println("Array bidimensional: ");
        int[][] edad = {{26, 22, 29}, {31, 33, 35}};

        for (int i = 0; i < edad.length; i++) {

            for (int j = 0; j < edad[1].length; j++) {
                System.out.println("Array: " + i + " " + "Posición: " + j + " " + "Valor: " + edad[i][j]);
            }

        }
        System.out.println("\n");

        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        System.out.println("Vector: ");
        Vector<String> apellidos = new Vector();
        apellidos.add("Garmienda");
        apellidos.add("Rudoff");
        apellidos.add("Nicotina");
        apellidos.add("Domuloni");
        apellidos.add("Rumplistin");

        System.out.println("Datos del vector: " + apellidos);

        //vector eliminamos 2 y 3 elemento y mostramos nuevamente:
        System.out.println("Vector eliminando elemento 2 y 3: ");
        apellidos.remove(2);
        apellidos.remove(3);
        System.out.println("Borramos elemento 2 y 3: " + apellidos);
        System.out.println("\n");


        //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        System.out.println("ArrayList y LinkedList: ");
        ArrayList<String> lista = new ArrayList<String>(4);
        lista.add("Martillo");
        lista.add("Destornillador");
        lista.add("Taladro");
        lista.add("Amoladora");

        for (String elementoArrayList : lista) {
            System.out.println(elementoArrayList);
        }

        System.out.println("\n");

        LinkedList<String> listaLinked = new LinkedList<String>(lista);

        for (String elementoLista : listaLinked) {
            System.out.println(elementoLista);
        }

        System.out.println("\n");

        //Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        // Por último, vuelve a recorrerlo y muestra el ArrayList final.
        // Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        System.out.println("Rellenando ArrayList y eliminando nros pares: ");
        ArrayList<Integer> listaInt = new ArrayList<Integer>(10);


        for (int i = 1; i < 11; i++) {
            listaInt.add(i);

            for (int num = 0; num < listaInt.size(); num++) {
                if (listaInt.get(num) % 2 == 0)
                    listaInt.remove(num);
            }
        }
        System.out.println("ArrayList relleno de enteros impares: " + listaInt);

        System.out.println("\n");

//Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo
// ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
// Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
// Finalmente, mostraremos en cualquier caso: "Demo de código".

        System.out.println("Funcion 'dividir por cero'");
        try {
            System.out.println(dividePorCero(14, 0));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse " + e);
        } finally {
            System.out.println("Demo de codigo");
        }

        System.out.println("\n");


//Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
// La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        System.out.println("Input Strem y PrinStrem: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.println("Introduce el fichero de destino: ");
        String fileOut = scanner.nextLine();
        copiar(fileIn, fileOut);


    }

    public static String reverse(String texto){
        String cadena = "";
        for(int i = texto.length() - 1; i >= 0; i--){
            cadena += texto.charAt(i);
        }
        return cadena;
    }

    public static int dividePorCero(int n1, int n2) throws ArithmeticException{
        return n1 / n2;
    }

    private static void copiar(String fileIn, String fileOut){
        try{
            InputStream in = new FileInputStream(fileIn);
            byte [] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }



}
