

/*Fecha: 22-02-2017

* Descripcion: Clase de persona, primera estructura de datos.
*una clase es una plantilla de donde puedo instanciar objetos de tipo persona.
*una instancia es una variable o un lugar en la memoria del computador 
*y almacena los atributos y metodos que tiene el objeto.

*Autor: Alejandro Aguilar 
 */
package estructuradedatos.estructuraobjeto;
/**
 *
 * @author utp
 */
public class Persona {
    
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        //codifico las reglas de negocio
        //para cambiar el atributo
        this.nombre = nombre;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCedula(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
    
    
    
    
}
