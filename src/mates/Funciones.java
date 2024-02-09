package mates;
import java.util.*;

public class Funciones {
    public static int suma(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int potencia(int base, int exponente) {
        int pot = 1;
        for (int i = 1; i <= exponente; i++) {
            pot *= base;
        }
        return pot;
    }

    public static int sumlista(int[] lista) {
        int sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += lista[i];
        }
        return sum;
    }

    public static double media(int[] lista) {
        return (double) sumlista(lista) / lista.length;
    }

    public static double desviacion(int[] lista) {
        double media = media(lista);
        double sum = 0;
        for (int i = 0; i < lista.length; i++) {
            sum += Math.pow(lista[i] - media, 2);
        }
        return Math.sqrt(sum / lista.length);
    }

    public static int sumpares(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int sumpareslista(int[] lista) {
        int sum = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                sum += lista[i];
            }
        }
        return sum;
    }

    public static int[] obtenerListaPares(int[] lista) {
        int[] listaParesTemp = new int[lista.length];
        int j = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 == 0) {
                listaParesTemp[j] = lista[i];
                j++;
            }
        }
        int[] listaPares = Arrays.copyOf(listaParesTemp, j);
        return listaPares;
    }
    public static List<Integer> listaPar(int n) {
        List<Integer> resultado = new ArrayList<>();
        // Comenzar desde el número par más cercano a n, o n mismo si es par
        int inicio = (n % 2 == 0) ? n : n - 1;
        for (int i = inicio; i >= 2; i -= 2) {
            resultado.add(i);
        }
        return resultado;
    }
    public static int calcularProductoEscalar(int[] lista1, int[] lista2) {
        int productoEscalar = 0;
        for (int i = 0; i < lista1.length; i++) {
            productoEscalar += lista1[i] * lista2[i];
        }
        return productoEscalar;
    }
}