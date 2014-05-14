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
public class Alumno {
    String nombre;
    ArrayList<Alumno> hermanos = new ArrayList<>();
    ArrayList<Conejo> conejos = new ArrayList<>();
    ArrayList<Canario> canarios = new ArrayList<>();
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void tocarOreja(Conejo conejo){
        conejo.moverCola();
    }
    
    public void agregarHermano(Alumno hermano){
        hermanos.add(hermano);
    }

    void agregarConejo(Conejo conejo) {
        conejos.add(conejo);
    }

    void agregarCanario(Canario canario) {
        canarios.add(canario);
    }    
    
}
