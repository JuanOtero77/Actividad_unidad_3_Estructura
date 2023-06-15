/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class PilaPersonalizada {

    private List<Integer> numeros;

    public PilaPersonalizada() {
        numeros = new ArrayList<>();
    }

    //operacion para agregar el elemento al inicio de la pila
    public void agregar(int numero) {
        numeros.add(0, numero);
    }

    //operacion para eliminar el primer elemento de la pila
    public void eliminar() {
        if (!numeros.isEmpty()) {
            numeros.remove(0);
        }
    }

    //operacion para verificar si el elemento esta en la pila
    public boolean encontrar(int numero) {
        return numeros.contains(numero);
    }

    //operacion para mostrar los elementos de pila en orden inverso
    public void mostrar() {
        for (int i = numeros.size() - 1; i >= 0; i--) {
            System.out.println(numeros.get(i));
        }
    }

    public static void main(String[] args) {
        PilaPersonalizada pila = new PilaPersonalizada();
        pila.agregar(23);
        pila.agregar(78);
        pila.agregar(99);
        pila.agregar(14);
        pila.agregar(13);
        
        System.out.println("se encontro el numero 99 de la cola:");
        System.out.println(pila.encontrar(99));
        pila.eliminar();
        System.out.println("se encontro el numero de 13 de la cola:");
        System.out.println(pila.encontrar(13));
        System.out.println("pila personalizada:");
        pila.mostrar();
    }
}
