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
public class PContratado extends Personal {
    private String usuario;
    private String password;
    private Rol rol;
    
    public PContratado(String pNombre, String pApellidos, String pDNI, String usuario, String password, Rol rol){
        this.SetApellidos(pApellidos);
        this.SetNombre(pNombre);
        this.SetDNI(pDNI);
        this.usuario = usuario;
        this.password = password;
        this.rol = rol;
    }
    public String GetUsuario(){
        return usuario;
    }
    public String GetPassword(){
        return password;
    }
    public boolean SetPassword(String p){
        if(p!= ""){
            password = p;
            return true;
        }
        return false;
    }
    public Rol GetRol(){
        return rol;
    }
    public void SetRol(Rol r){
        rol = r;
    }
}
