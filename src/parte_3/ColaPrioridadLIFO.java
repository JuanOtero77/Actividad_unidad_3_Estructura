/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_3;

import java.util.Stack;

/**
 *
 * @author PC
 */
public class ColaPrioridadLIFO {
     private Stack<Integer> numeros;

    public ColaPrioridadLIFO() {
        numeros = new Stack<>();
    }
    
    //operacion para agregar el elemento en la cola
    public void agregar(int numero) {
        numeros.push(numero);
    }
    
    //operacion para eliminar el elemento y obtener el elemento mas reciente de la cola
    public void eliminar() {
        numeros.pop();
    }
    
    //operacion para verificar si el elemento esta en la cola
    public boolean encontrar(int numero) {
        return numeros.contains(numero);
    }
    
    //operacion para mostrar los elementos de una cola
    public void mostrar(){
        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }
    
    public static void main(String[] args) {
        ColaPrioridadFIFO cola = new ColaPrioridadFIFO();
        cola.agregar(12);
        cola.agregar(34);
        cola.agregar(56);
        cola.agregar(32);
        cola.agregar(45);
        
        System.out.println("se encontro el numero 56 de la cola:");
        System.out.println(cola.encontrar(56));
        cola.eliminar(56);
        System.out.println("se encontro el numero de 56 de la cola:");
        System.out.println(cola.encontrar(56));
        System.out.println("cola personalizada con prioridad LIFO:");
        cola.mostrar();
    }
}
