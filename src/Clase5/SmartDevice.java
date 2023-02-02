//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//        Crear constructor vacío y con todos los parámetros para cada clase.
//
//        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
//
package Clase5;

public class SmartDevice {
    protected String marca;
    protected String color;
    protected int precio;
    protected double peso;

    public SmartDevice() {
    }

    public SmartDevice(String marca, String color, int precio, double peso){
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.peso = peso;

    }


}
