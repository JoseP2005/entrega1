package aplicacion;
import mates.Funciones;
import java.util.Arrays;
public class Principal {
    public static void main(String[] args) {
        System.out.println("la Suma del 1 hasta el 10 es: " + Funciones.suma(10));
        System.out.println("el Factorial de 5 es: " + Funciones.factorial(5));
        System.out.println("la Potencia de 2 elevado a 3 es: " + Funciones.potencia(2, 3));
        int[] lista = {1, 2, 3, 4, 5,6 ,7, 8, 9,1};
        System.out.println("la Suma de la lista es: " + Funciones.sumlista(lista));
        System.out.println("la Media de la lista es: " + Funciones.media(lista));
        System.out.println("la Desviacion de la lista es: " + Funciones.desviacion(lista));
        System.out.println("la Suma de los pares del 1 hasta el 10 es: " + Funciones.sumpares(10));
        System.out.println("la Suma de los pares de la lista es: " + Funciones.sumpareslista(lista));
        int[] listaPares = Funciones.obtenerListaPares(lista);
        System.out.println("Lista de pares: " + Arrays.toString(listaPares));
        System.out.println("la lista de los primeros numeros pares hasta n: " + (Funciones.listaPar(10)));
        System.out.println("Producto Escalar de las listas: " + Funciones.calcularProductoEscalar(new int[]{1, 2, 3}, new int[]{4, 5, 6}));

    }
}
