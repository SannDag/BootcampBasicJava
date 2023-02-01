//Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
package Clase3;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println(precioMasIva(200));

    }

    public static double precioMasIva(double precio){
        double iva = 1.21;
        double resultado = precio * iva;
        return resultado;
    };
}
