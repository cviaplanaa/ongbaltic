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
public class IPublicos extends Ingresos {
    private Administracion administracion;
    
        public IPublicos(int id, String nombre, Administracion administracion){
        this.SetId(id);
        this.SetNombre(nombre);
        this.administracion = administracion;
    }

    public Administracion GetAdministracion(){
        return administracion;
    }

    public void SetAdministracion(Administracion a){
        administracion = a;
    }
}
