package net.allacalle.android.prototipourgencyassist2;

import android.content.pm.InstrumentationInfo;

/**
 * Created by Alfonso on 20/10/2015.
 */
public class Parametro
{
    private String tipo;
    private String nombre;
    private CriterioPuntuacion [] criterio;
    private String medida;

    //setters y getters sencillos de la clase

    public String getMedida() {
        return medida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
