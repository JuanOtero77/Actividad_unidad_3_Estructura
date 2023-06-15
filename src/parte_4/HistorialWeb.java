/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parte_4;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PC
 */
public class HistorialWeb {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String Url = "";
        
        while(true){
            System.out.println("Esta en la pagina: "+Url);
            System.out.println("Opciones:");
            System.out.println("1.Ir a una nueva pagina");
            System.out.println("2.devolverse a la pagina anterior");
            System.out.println("3.cerrar el histiorial");
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    if(!Url.isEmpty()){
                        historial.push(Url);
                    }
                    System.out.println("Ingresar la nueva URL de la pagina: ");
                    Url = sc.next();
                    System.out.println("cargando la pagina: "+Url);
                    break;
                case 2:
                    if(!historial.isEmpty()){
                        String UrlAnterior = historial.pop();
                        System.out.println("cargando la pagina anterior"+UrlAnterior);
                        Url = UrlAnterior;
                    }else{
                        System.out.println("no hay paginas anteriores");
                    }
                    break;
                case 3:
                    System.out.println("cerrando el programa...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("intentalo de nuevo");
                    break;
            }
        }
    }
}
