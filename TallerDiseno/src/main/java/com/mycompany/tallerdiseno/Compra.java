/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerdiseno;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Compra {
    private Pago pago;
    private List articulos;

    public Compra(Pago pago) {
        // Inicializaciones
        this.pago = pago;
        articulos = new ArrayList<>();
    }
    
    public void agregarArticulo(Articulo articulo)
    {
        // Agregar un artículo a la compra
    }
    
    public void removerArticulo(Articulo articulo)
    {
        // Remover un artículo a la compra
    }
}
