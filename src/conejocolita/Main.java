/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conejocolita;

/**
 *
 * @author consultor05
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instanciando colegio
        Colegio colegio = new Colegio();
        colegio.setNombre("San Agustin");   
                
        //instanciando alumno Carlos
        Alumno alumno1 = new Alumno();
        alumno1.setNombre("Carlos");
        
        //instanciando conejo colita
        Conejo conejo1 = new Conejo();
        conejo1.setNombre("colita");
        // indicandole dueños al conejo colita
        alumno1.agregarConejo(conejo1);
        
  
        //instanciando alumno Joaquín que será hermano
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("joaquin");
        //Agregando hermano a Carlos
        alumno1.agregarHermano(alumno2);
        
        
        //instanciando conejo de Joaquin
        Conejo conejo2 = new Conejo();
        conejo2.setNombre("rabito");

        //indicandole dueños al conejo rabito
        alumno1.agregarConejo(conejo2);
        alumno2.agregarConejo(conejo2);
        
        //instanciando Alumno Pedro
        Alumno alumno3 = new Alumno();
        alumno3.setNombre("Pedro");
        //instanciando Canario 
        Canario canario = new Canario();
        canario.setNombre("Pancho");
        
        alumno3.agregarCanario(canario);
       
        //instanciando alumnas
        Alumno alumno4 = new Alumno();
        alumno4.setNombre("Sandra");
        
        Alumno alumno5 = new Alumno();
        alumno5.setNombre("Fernanda");
        
        //Agregando alumnos al colegio
        colegio.agregarAlumno(alumno1);
        colegio.agregarAlumno(alumno2);
        colegio.agregarAlumno(alumno3);
        colegio.agregarAlumno(alumno4);
        colegio.agregarAlumno(alumno5);
        
        System.out.println(colegio);
        
        //ejecutando método
        // alumno1.tocarOreja(conejo1);
        
        
        
        
        
        
    }
    
}
