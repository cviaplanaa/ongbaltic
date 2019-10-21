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
public class Ong {
    private String nombre;
    private SedeCentral sedeCentral;
    private ArrayList<Delegacion> delegacion;
    private float ingresos;
    
    
    public Ong(String pNombre, SedeCentral pSedeCentral, ArrayList<Delegacion> pDelegacion){
        this.nombre = pNombre;
        this.sedeCentral = pSedeCentral;
        this.delegacion = pDelegacion;
        this.ingresos = 0f;
    }
    public String GetNombre(){
        return nombre;
    }
    public ArrayList<Delegacion> GetDelegaciones(){
        return delegacion;
    }
    public boolean AddDelegacion(Delegacion d){
        return delegacion.add(d);
    }
    public void RemoveDelegacion(Delegacion d){
        delegacion.remove(d);
    }
    public float GetIngresos(){
        return ingresos;
    }
    public void AddIngresos(float i){
        ingresos += i;
    }
}
