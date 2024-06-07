/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdiseno;

/**
 *
 * @author CltControl
 */
public class PagoPaypal extends Pago{
    
    private boolean loggedIn; // Conexión a cuenta PayPal

    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn)
        {
            login();
        }
        // Cargar el monto de compra al medio de pago PAYPAL
    }
    
    public void login()
    {
        // Lógica para iniciar sesión en PayPal
    }
    
    
    
}
