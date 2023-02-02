//En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
//
//        Agregaréis atributos tal cual tendrían esos objetos en la realidad.
//
//        Crear constructor vacío y con todos los parámetros para cada clase.
//
//        Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.

package Clase5;

public class SmartPhone extends SmartDevice{
    public boolean camaraFrontal;
    public int megapixelCamara;

    public SmartPhone(){
        super();
    }

    public SmartPhone(String marca, String color, int precio, double peso, boolean camaraFrontal, int megapixelCamara) {
        super(marca, color, precio, peso);
        this.camaraFrontal = camaraFrontal;
        this.megapixelCamara = megapixelCamara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camaraFrontal=" + camaraFrontal +
                ", megapixelCamara=" + megapixelCamara +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio + "usd" +
                ", peso=" + peso + "g" +
                '}';
    }

}
