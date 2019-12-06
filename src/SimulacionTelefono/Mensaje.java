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
    private Contacto receptor;
    private Date fecha;

    public Mensaje() {
    }

    public Mensaje(String emisor, String contenido, Contacto receptor, Date fecha) {
        this.emisor = emisor;
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

    public void setReceptor(Contacto receptor) {
        this.receptor = receptor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getContenido() {
        return contenido;
    }

    public Contacto getReceptor() {
        return receptor;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return format.format(getFecha()) +"-->"+ this.getReceptor().getNombre();   
    }
    
    public String getContenidoFormateado(){
        return "";
    }
    
    
}
