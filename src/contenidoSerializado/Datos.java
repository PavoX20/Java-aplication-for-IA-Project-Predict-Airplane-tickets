/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contenidoSerializado;

import java.io.Serializable;

/**
 *
 * @author pavox20
 */
public class Datos implements Serializable{
    String datos[];
    String datosNum[];
    String prediccion[]=new String[100];
    
    public Datos(String[] datos ) {
        this.datos = datos;
        
    }

    public String[] getDatos() {
        return datos;
    }

    public String[] getDatosNum() {
        return datosNum;
    }

    public String[] getPrediccion() {
        return prediccion;
    }

    public void setDatos(String[] datos) {
        this.datos = datos;
    }

    public void setDatosNum(String[] datosNum) {
        this.datosNum = datosNum;
    }

    public void setPrediccion(String[] prediccion) {
        this.prediccion = prediccion;
    }

    @Override
    public String toString() {
        return "Datos{" + "datos=" + datos + ", datosNum=" + datosNum + ", prediccion=" + prediccion + '}';
    }

    

    
    
    
    
}
