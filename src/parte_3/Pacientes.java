/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Pacientes {
    //operacion para agregar a los pacientes en la cola.
    public static void agregar(Queue<String> Cola,String pacientes) {
        Cola.add(pacientes);
    }
    //Si la cola no esta vacia se atiende al paciente.
    public static void AtenderPacientes(Queue<String> Cola){
        while(!Cola.isEmpty()){
            String paciente = Cola.poll();
            //se atiente al paciente
            System.out.println("atentiendo al paciente: "+paciente);
            //se elimina de la cola
        }
    }
    public static void main(String[] args) {
        //Se crea una lista vacia para guardar a los pacientes
        Queue<String> colaPacientes = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        //Se ingresan el numero de pacientes que hay por teclado
        System.out.println("Ingresar el numero de los pacientes: ");
        int numPacientes = sc.nextInt();
        sc.nextLine();
        
        //se agregan el nombre de los pacientes
        for (int i = 0; i < numPacientes; i++) {
            System.out.println("ingresar el nombre del paciente "+(i + 1)+": ");
            String pacientes = sc.nextLine();
            agregar(colaPacientes, pacientes);
        }
        //se atiende al paciente
        AtenderPacientes(colaPacientes);
        sc.close();
    }
}
