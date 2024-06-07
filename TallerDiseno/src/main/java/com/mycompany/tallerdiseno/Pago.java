/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdiseno;

/**
 *
 * @author CltControl
 */
public abstract class Pago {
    protected double monto;
    
    public void realizarCobro(double monto)
    {
        // Cargar el monto de compra al medio de pago
    }
    
    public void calcularImpuestoCompra()
    {
        // Calcula los impuestos asociados a la compra
    }
    
    public void calcularTotal()
    {
        // Calcula el total de la compra
    }
}
