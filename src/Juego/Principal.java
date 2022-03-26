/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juego;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hector
 */
public class Principal {

    public static void main(String[] args) {

        int meta = 3000;
        int recorrido, dado;
        boolean jugador1 = true;
        boolean jugador2 = true;
        Scanner leer = new Scanner(System.in);
        Jugador uno = new Jugador();
        Jugador dos = new Jugador();
        Carro renault = new Carro();
        Carro mazda = new Carro();

        Random rand = new Random(System.nanoTime());
        int aleatorio = rand.nextInt(7);

        renault.setConductor("Mike");
        renault.setKm(0);
        mazda.setConductor("Jir");
        mazda.setKm(0);
        System.out.println("Ingrese el nombre del jugador uno:");
        uno.setNombre(leer.nextLine());
        System.out.println("Ingrese el nombre del jugador dos:");
        dos.setNombre(leer.nextLine());

        System.out.println("El jugador uno es: " + uno.getNombre() + " y tiene una distancia recorrida de " + renault.getKm());
        System.out.println("El jugador dos es: " + dos.getNombre() + " y tiene una distancia recorrida de " + mazda.getKm());

        do {

            if (jugador1) {

                dado = uno.lanzar();
                recorrido = renault.avanzar(dado);
                System.out.println(uno.getNombre()+" lanzo el dado y saco: " + dado);
                
                
            }
            if (jugador2) {

                dado = dos.lanzar();
                recorrido = mazda.avanzar(dado);
                System.out.println(dos.getNombre()+" lanzo el dado y saco: " + dado);
                

            }
            if (renault.getKm() >= meta) {
                
                System.out.println(uno.getNombre()+" es el ganador");
                
            }else if(mazda.getKm() >= meta){
                
               System.out.println(dos.getNombre()+" es el ganador"); 
                
            }
            
            System.out.println("El avance del jugador " + uno.getNombre() + " es de: " + renault.getKm());
            System.out.println("El avance del jugador " + dos.getNombre() + " es de: " + mazda.getKm());

            try {
                System.in.read();
            } catch (Exception e) {
                
            }

        } while (renault.getKm() < 3000 && mazda.getKm() < 3000);

    }

}
