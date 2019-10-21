/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5;

/**
 *
 * @author Josep
 */
public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    
    //A l'esquema es INT
    void SetDNI(String d){
        dni = d;
    }    
    public String GetDNI(){
        return dni;
    }
    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String n){
        nombre = n;
    }    
    public String GetApellidos(){
        return apellidos;
    }
    public void SetApellidos(String a){
        apellidos = a;
    }
}
