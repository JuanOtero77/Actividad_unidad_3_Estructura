/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class CallCenter {
    //operacion para agregar a los clientes en la cola.
    public static void agregar(Deque<String> Cola,String cliente) {
        Cola.addLast(cliente);
    }
    //Si la cola no esta vacia se atiende al cliente.
    public static void AtenderLlamadas(Deque<String> Cola){
        while(!Cola.isEmpty()){
            String cliente = Cola.removeLast();
            //se atiente al cliente
            System.out.println("atentiendo al cliente: "+cliente);
            //se elimina de la cliente
        }
    }
    public static void main(String[] args) {
        //Se crea una lista vacia para guardar a los pacientes
        Deque<String> ColaClientes = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        //Clientes vips
        System.out.println("Ingresar el numero de los Clientes vips: ");
        int numVips = sc.nextInt();
        sc.nextLine();
        //se agregan el nombre de los pacientes
        for (int i = 0; i < numVips; i++) {
            System.out.println("ingresar el nombre del cliente vip "+(i + 1)+": ");
            String clienteVip = sc.nextLine();
            agregar(ColaClientes, clienteVip);
        }
        //Clientes con poblemas especiales
        System.out.println("Ingresar el numero de los Clientes con poblemas: ");
        int numPE = sc.nextInt();
        sc.nextLine();
        //se agregan el nombre de los pacientes
        for (int i = 0; i < numPE; i++) {
            System.out.println("ingresar el nombre del cliente con poblemas "+(i + 1)+": ");
            String clientePE = sc.nextLine();
            agregar(ColaClientes, clientePE);
        }
        //Clientes regulares
        System.out.println("Ingresar el numero de los Clientes regulares: ");
        int numRegular = sc.nextInt();
        sc.nextLine();
        //se agregan el nombre de los pacientes
        for (int i = 0; i < numRegular; i++) {
            System.out.println("ingresar el nombre del cliente regular "+(i + 1)+": ");
            String clienteRegular = sc.nextLine();
            agregar(ColaClientes, clienteRegular);
        }
        AtenderLlamadas(ColaClientes);
        sc.close();
    }
}
