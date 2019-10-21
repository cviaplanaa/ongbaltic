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
public class IPrivados extends Ingresos {
    private Aportaciones aportacion;
    
    public IPrivados(int id, String nombre, Aportaciones aportacion){
        this.SetId(id);
        this.SetNombre(nombre);
        this.aportacion = aportacion;
    }

    public Aportaciones GetAportacion(){
        return aportacion;
    }

    public void SetAportacion(Aportaciones a){
        aportacion = a;
    }
}
