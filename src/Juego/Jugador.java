/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.Random;

/**
 *
 * @author Hector
 */
public class Jugador {
    
    private String nombre;
    private Random rand = new Random(System.nanoTime());
    
    public String getNombre(){
        
        return nombre;
        
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
        
    }
    
    
    public int lanzar(){
        
        int aleatorio = rand.nextInt(7);
        return aleatorio;
    }
    
}
