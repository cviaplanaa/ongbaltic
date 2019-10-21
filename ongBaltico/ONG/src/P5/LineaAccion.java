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
public abstract class LineaAccion {
    private String nombre;
    private ArrayList<String> subLineas;
        
        
    public String GetNombre(){
        return nombre;
    }
    public void SetNombre(String n){
        nombre = n;
    }
    
    public ArrayList<String> GetSubLineas(){
        return subLineas;
    }
    public boolean AddSubLinea(String s){
        return subLineas.add(s);
    }
    public void RemoveSubLinea(String s){
        subLineas.remove(s);
    }
}
