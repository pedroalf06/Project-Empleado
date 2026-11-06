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
public class EmpleadoH extends Empleado {
    
    private int ht;
    private double ch;
    private double sueldoQH;

    public void setHt(int ht) {
        this.ht = ht;
    }

    public void setCh(double ch) {
        this.ch = ch;
    }

    public double getSueldoQH() {
        return sueldoQH;
    }
    
    public void calcularH(){
        sueldoQH = ht * ch;
    }
    
    
}
