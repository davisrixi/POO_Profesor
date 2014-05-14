/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conejocolita;

import java.util.ArrayList;

/**
 *
 * @author consultor05
 */
public class Conejo {
    String nombre;
    String nick;


    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void moverCola(){
        System.out.println(nombre + " Moviendo cola...");
    }
    

}
