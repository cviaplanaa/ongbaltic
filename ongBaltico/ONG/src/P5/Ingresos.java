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
public class Ingresos {
    private int id;
    private int cantidad;
    private String nombre;

    //Si el descomentem no deixa crear el constructor de IPrivados
//    public Ingresos(int id, String nombre){
//        this.id = id;
//        this.nombre = nombre;
//    }
    
    public int GetCantidad(){
        return cantidad;
    }

    public void AddCantidad(int i){
        cantidad += i;
    }

    public String GetNombre(){
        return nombre;
    }

    public void SetNombre(String n){
        nombre = n;
    }
    
    public int GetId(){
        return id;
    }
    //no posem public, private o protected per tal de que s'hi pugui acceder des
    //una clase filla -> https://stackoverflow.com/questions/215497/what-is-the-difference-between-public-protected-package-private-and-private-in
    void SetId(int i){
        if (id == 0){
            this.id = i;
        }
    }
}
