/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.Collections;

public class OrdenamientoPorInsercion {

    public static void ordenarPorInsercion(ArrayList<String> lista) {
        for (int i = 1; i < lista.size(); i++) {
            String libroActual = lista.get(i);
            int j = i - 1;
            
            // Mover elementos de la lista que son mayores que el libroActual
            // a una posición más adelante de su posición actual
            while (j >= 0 && lista.get(j).compareTo(libroActual) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, libroActual);
        }
    }

    public static void main(String[] args) {
        // Ejemplo de lista desordenada de títulos de libros
        ArrayList<String> titulos = new ArrayList<>();
        titulos.add("Zorro");
        titulos.add("El Principito");
        titulos.add("Cien Años de Soledad");
        titulos.add("Harry Potter");
        titulos.add("El Hobbit");

        // Mostrar los títulos antes del ordenamiento
        System.out.println("Títulos de libros desordenados: " + titulos);

        // Ordenar los títulos
        ordenarPorInsercion(titulos);

        // Mostrar los títulos después del ordenamiento
        System.out.println("Títulos de libros ordenados: " + titulos);
    }
}