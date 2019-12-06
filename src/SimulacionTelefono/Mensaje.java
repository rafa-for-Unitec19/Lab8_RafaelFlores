/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionTelefono;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Faith
 */
public class Mensaje {
    private String emisor, contenido;
    private String receptor;
    private String fecha;

    public Mensaje() {
    }

    public Mensaje(String contenido, String receptor, String fecha) {
        this.emisor = "Rafael";
        this.contenido = contenido;
        this.receptor = receptor;
        this.fecha = fecha;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getContenido() {
        return contenido;
    }

    public String getReceptor() {
        return receptor;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return getFecha() +"-->"+ this.getReceptor();   
    }
    
    public String getContenidoFormateado(){
        return "Emisor: "+this.getEmisor()
               +"\nReceptor: "+ this.getReceptor()
               +"\n"
               +"En Fecha:"+this.getFecha()
               +"\nContenido: \n\t"+this.getContenido();
    }
    
    
}
