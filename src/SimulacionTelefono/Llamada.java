/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimulacionTelefono;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faith
 */
public class Llamada extends Thread{
    private String emisor, recpetor, fecha;
    private int duracion, min;
    private SimpleDateFormat formato;
    private JTable tabla;
    private DefaultTableModel modeloTabla;
    private JLabel Salida;
    private boolean vive, avanzar;

    public Llamada(String recpetor, JTable tabla, DefaultTableModel modeloTabla, JLabel Salida) {
        this.emisor = "Rafa";
        this.formato = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        this.fecha = formato.format(new Date());
        this.vive = true;
        this.avanzar = true;
        this.duracion = 0;
        this.min = 0;
        this.recpetor = recpetor;
        this.tabla = tabla;
        this.modeloTabla = modeloTabla;
        this.Salida = Salida;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setRecpetor(String recpetor) {
        this.recpetor = recpetor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setFormato(SimpleDateFormat formato) {
        this.formato = formato;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public void setSalida(JLabel Salida) {
        this.Salida = Salida;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public String getEmisor() {
        return emisor;
    }

    public String getRecpetor() {
        return recpetor;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public SimpleDateFormat getFormato() {
        return formato;
    }

    public JTable getTabla() {
        return tabla;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public JLabel getSalida() {
        return Salida;
    }

    @Override
    public void run(){
        while(vive){
            if (avanzar) {
                duracion += duracion + 1;
                if (duracion >= 60) {
                    duracion = 0;
                    min += 1;
                }
                this.Salida.setText(min+" : "+duracion);
            }else{
                this.modeloTabla = (DefaultTableModel) this.tabla.getModel();
                Object[] row =  {
                    emisor, 
                    recpetor,
                    this.Salida.getText(),
                    fecha
                };
                modeloTabla.addRow(row);
                this.tabla.setModel(modeloTabla);
                vive = false;
            }
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
            }
        }
    }
    
    
    
}
