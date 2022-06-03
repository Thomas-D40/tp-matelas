/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.core.entities;

import java.util.HashSet;

/**
 *
 * @author Administrateur
 */
public class Stock {
    
    public HashSet<Matelas> stock = new HashSet();
    
    public Stock() {
        stock.add(new Matelas(1, "Matelas 1", 200, 120, 800));
        stock.add(new Matelas(2, "Matelas 2", 240, 180, 2200));
        stock.add(new Matelas(3, "Matelas 3", 180, 90, 600));       
    }
    
}
