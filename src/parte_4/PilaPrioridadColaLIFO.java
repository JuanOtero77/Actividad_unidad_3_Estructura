/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_4;

import java.util.Stack;

/**
 *
 * @author PC
 */
public class PilaPrioridadColaLIFO {
     private Stack<Integer> numeros;

    public PilaPrioridadColaLIFO() {
        numeros = new Stack<>();
    }
    
    //operacion para agregar el elemento en la pila
    public void agregar(int numero) {
        numeros.push(numero);
    }
    
    //operacion para eliminar el elemento superior en la pila y obtener su valor
    public int eliminar() {
        return numeros.pop();
    }
    
    //operacion para verificar si el elemento esta en la pila
    public boolean encontrar(int numero) {
        return numeros.contains(numero);
    }
    
    //operacion para mostrar los elementos de una pila
    public void mostrar(){
        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
    
    public static void main(String[] args) {
        PilaPrioridadColaLIFO pila = new PilaPrioridadColaLIFO();
        pila.agregar(67);
        pila.agregar(45);
        pila.agregar(78);
        pila.agregar(89);
        pila.agregar(15);
        
        System.out.println("se encontro el numero 78 de la cola:");
        System.out.println(pila.encontrar(78));
        pila.eliminar();
        System.out.println("se encontro el numero de 15 de la cola:");
        System.out.println(pila.encontrar(15));
        System.out.println("cola personalizada con prioridad LIFO:");
        pila.mostrar();
    }
}
