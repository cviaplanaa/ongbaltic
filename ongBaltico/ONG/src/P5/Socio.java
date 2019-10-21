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
public class Socio extends Persona {
    private Cuota cuota;
    private int importe;
    
    public Socio(String pNombre, String pApellidos, String pDni, Cuota pCuota, int pImporte){
        this.cuota = pCuota;
        this.importe = pImporte;
        this.SetDNI(pDni);
        this.SetApellidos(pApellidos);
        this.SetNombre(pNombre);
    }
    public Cuota GetCuota(){
        return cuota;
    }
    public void SetCuota(Cuota c){
        cuota = c;
    }
    public int GetImporte(){
        return importe;
    }
    public void SetImporte(int i){
        importe = i;
    }
}
