/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.emplead1;

import com.mycompany.emplead1.Empleado;
import com.mycompany.emplead1.Empleado;

/**
 *
 * @author UNPA
 */
public class EmpleadoS extends Empleado {
    private double salario;
    private double SueldoQS;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSueldoQS() {
        return SueldoQS;
    }
    
   public void calcularS(){
       SueldoQS = salario/2;
   } 
    
    
}
