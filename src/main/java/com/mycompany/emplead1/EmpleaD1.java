/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emplead1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class EmpleaD1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<EmpleadoH> listaH = new ArrayList<>();
        ArrayList<EmpleadoS> listaS = new ArrayList<>();
        
        String nombre, dpto, puesto;
        int opc;
        
        do{
        
        System.out.println("\n******* Menu ******** \nIngrese la opcion que desea: ");
        System.out.println("1 - Trabajador hora \n2 - Asalariado \n3 - Consulta empleado por hora \n4 - Consulta empleado asalariado \n5 -  Salir");
        opc = sc.nextInt();
        
        switch(opc){
       
       case 1: 
        EmpleadoH h = new EmpleadoH();
        
        sc.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese dpto ");
        dpto = sc.nextLine();
        
        System.out.println("Ingrese puesto: ");
        puesto = sc.nextLine();
        
        System.out.println("ingrese horas trabajadas");
        int ht = sc.nextInt();
        
        System.out.println("Ingrese cuota hora");
        double ch = sc.nextDouble();
        
        h.setNombre(nombre);
        h.setDpto(dpto);
        h.setPuesto(puesto);
        h.setHt(ht);
        h.setCh(ch);
        h.calcularH();
        System.out.println("\nNombre: "+h.getNombre());
        System.out.println("Sueldo Quincenal: "+h.getSueldoQH());
        listaH.add(h);
       sc.nextLine();
        
        break; 
       
       case 2:
           
        EmpleadoS s = new EmpleadoS();
        
        sc.nextLine();
        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese dpto ");
        dpto = sc.nextLine();
        
        System.out.println("Ingrese puesto: ");
        puesto = sc.nextLine();
        
        System.out.println("Ingrese sueldo mensual fijo: ");
        double salario = sc.nextDouble();
        
        s.setNombre(nombre);
        s.setDpto(dpto);
        s.setPuesto(puesto);
        s.setSalario(salario);
        s.calcularS();
        System.out.println("\nNombre: "+s.getNombre());
        System.out.println("Sueldo Quincenal: "+s.getSueldoQS());
        listaS.add(s);
         sc.nextLine();
   break;
   
       case 3: System.out.println("\nLista de empleados por Hora");
        
        for(int i= 0; i<listaH.size(); i++){
        EmpleadoH hh = listaH.get(i);
        
        System.out.println("Nombre: "+hh.getNombre()+ " | Sueldo Quincenal: "+hh.getSueldoQH());
        
           
           
       }
        sc.nextLine();
           break;
       
       case 4: System.out.println("\nLista de empleados por Salario");
        for(int i= 0; i<listaS.size(); i++){
        EmpleadoS ss = listaS.get(i);
        
        System.out.println("Nombre: "+ss.getNombre()+ " | Sueldo Quincenal: "+ss.getSueldoQS());
        
         
           
       }
         sc.nextLine();
           break;
       
       
       
       case 5: System.out.println("Adios");
       break;
       
       default: System.out.println("Opcion invalida");
       sc.nextLine();
       break;
       
        }
        sc.nextLine();
        }while(opc != 5);
        
        
    }
}
