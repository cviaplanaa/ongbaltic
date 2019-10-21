/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package P5;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Josep
 */
public class Proyecto {
    private String pais;
    private String localizacion;
    private ArrayList<LineaAccion> lineaAccion;
    private Date fechaI;
    private Date fechaF;
    private Socio socioLocal;
    private String financiador;
    private float financiacionApor;
    private ArrayList<PVoluntario> voluntarios;
    
    
    public Proyecto(String pPais, String pLocalizacion, ArrayList<LineaAccion> lineaAccion, 
            Date pFechaI, Date pFechaF, Socio pSocioLocal, String pFinanciador, float pFinanciacionApor, 
            ArrayList<PVoluntario> pVoluntarios){
        this.pais = pPais;
        this.localizacion = pLocalizacion;
        this.lineaAccion = lineaAccion;
        this.fechaI = pFechaI;
        this.fechaF = pFechaF;
        this.socioLocal = pSocioLocal;
        this.financiador = pFinanciador;
        this.financiacionApor = pFinanciacionApor;
        this.voluntarios = pVoluntarios;
    }
    public String GetPais(){
        return pais;
    }
    public void SetPais(String p){
        pais = p;
    }
    public String GetLocalizacion(){
        return localizacion;
    }
    public void SetLocalizacion(String l){
        localizacion = l;
    }
    public ArrayList<LineaAccion> GetLineaAccion(){
        return lineaAccion;
    }
    public boolean AddLineaAccion(LineaAccion l){
        return lineaAccion.add(l);
    }
    public void RemoveLineaAccion(LineaAccion l){
        lineaAccion.remove(l);
    }
    public Date GetFechaInicio(){
        return fechaI;
    }
    public void SetFechaInicio(Date f){
        fechaI = f;
    }
    public Date GetFechaFinal(){
        return fechaF;
    }
    public void SetFechaFinal(Date f){
        fechaF = f;
    }
    public Socio GetSocioLocal(){
        return socioLocal;
    }
    public void SetSocioLocal(Socio s){
        socioLocal = s;
    }
    public String GetFinanciador(){
        return financiador;
    }
    public void SetFinanciador(String f){
        financiador = f;
    }
    public float GetFinanciacion(){
        return financiacionApor;
    }
    public void SetFinanciacion(float f){
        financiacionApor = f;
    }
    public ArrayList<PVoluntario> GetVoluntarios(){
        return voluntarios;
    }
    public boolean AddVoluntario(PVoluntario v){
        return voluntarios.add(v);
    }
    public void RemoveVoluntario(PVoluntario v){
        voluntarios.remove(v);
    }
}
