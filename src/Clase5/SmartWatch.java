//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//        Crear constructor vacío y con todos los parámetros para cada clase.
//
//        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
package Clase5;

public class SmartWatch extends SmartDevice{

    public boolean sumergible;
    public String malla;

    public SmartWatch(){
        super();
    }

    public SmartWatch(String marca, String color, int precio, double peso, boolean sumergible, String malla) {
        super(marca, color, precio, peso);
        this.sumergible = sumergible;
        this.malla = malla;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "sumergible=" + sumergible +
                ", malla='" + malla + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio='" + precio + "usd" +
                ", peso=" + peso + "g"+
                '}';
    }
}
