/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import estructuradedatos.estructuraobjeto.Persona;

/**
 *
 * @author utp
 */
public class Estructuradedatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Persona pedro = new Persona ();
    
       pedro.setNombre ("pedro perez");
       
       pedro.setDireccion("rtr4");
        
        System.out.println("Mombre: "+ pedro.getNombre()
                + "Direccion:" + pedro.getDireccion());
                
                
        
        
        
        
        
        // TODO code application logic here
    }
    
}
