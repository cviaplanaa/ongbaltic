/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P5;

import java.util.ArrayList;

/**
 *
 * @author Josep
 */
public class SedeCentral {
    private String nombre;
    private String direccion;
    private int telefono;
    private String ciudad;
    private ArrayList<Personal> personal;
    
    public SedeCentral(String pNombre, String pDireccion, int pTelefono, String pCiudad, ArrayList<Personal> pPersonal) {
        this.nombre = pNombre;
        this.direccion = pDireccion;
        this. telefono = pTelefono;
        this.ciudad = pCiudad;
        this.personal = pPersonal;
    }
    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String n){
        nombre = n;
    }
    public String GetDireccion(){
        return direccion;
    }
    public void SetDireccion(String d){
        direccion = d;
    }
    public int GetTelefono(){
        return telefono;
    }
    public void SetTelefono(int t){
        telefono = t;
    }
    public String GetCiudad(){
        return ciudad;
    }
    public void SetCiudad(String c){
            ciudad = c;
    }
    public ArrayList<Personal> GetPersonal(){
        return personal;
    }
    public Persona GetPersona(int i){
        return personal.get(i);
    }
    public boolean AddPersonal(Personal p){
        return personal.add(p);
    }
    public void RemovePersonal(Persona p){
        personal.remove(p);
    }
}
