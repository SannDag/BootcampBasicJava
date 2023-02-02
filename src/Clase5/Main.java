//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//        Crear constructor vacío y con todos los parámetros para cada clase.
//
//        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
//

package Clase5;

public class Main {

    public static void main(String[] args) {

        SmartWatch reloj = new SmartWatch("Casio","rojo", 245, 350, true, "metalica");
        System.out.println("Caracteristicas del reloj: " + reloj);

        SmartPhone celular = new SmartPhone("Iphone","azul", 650, 800, true, 12);
        System.out.println("Caracteristicas del celular: " + celular);
    }
}
