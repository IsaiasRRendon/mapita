package is.lab.mapita.modelo;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
// Generated 08-feb-2019 13:44:51 by Hibernate Tools 4.3.1

/**
 * opossum
 */
public class Marcador  implements java.io.Serializable {

     private int idmarcador;
     private Usuario usuario;
     private String descripcion;
     private double longitud;
     private double latitud;

    public Marcador() {
    }

	
    public Marcador(int idmarcador, String descripcion, double longitud, double latitud) {
        this.idmarcador = idmarcador;
        this.descripcion = descripcion;
        this.longitud = longitud;
        this.latitud = latitud;
    }
    public Marcador(int idmarcador, Usuario usuario, String descripcion, double longitud, double latitud) {
       this.idmarcador = idmarcador;
       this.usuario = usuario;
       this.descripcion = descripcion;
       this.longitud = longitud;
       this.latitud = latitud;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }


}


