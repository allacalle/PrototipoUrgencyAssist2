package net.allacalle.android.prototipourgencyassist2;

/**
 * Created by Alfonso on 20/10/2015.
 */
public class Formula
{
    private String tipoFormula;
    private String nombreCompleto;
    private String abreviatura;
    private String expresion;
    private  Parametro parametro ;

    public String getTipoFormula()
    {
        return tipoFormula;
    }

    public String getNombreCompleto()
    {
        return nombreCompleto;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public String getExpresion() {
        return expresion;
    }

    public Parametro getParametro() {
        return parametro;
    }

    public void setTipoFormula(String tipoFormula) {
        this.tipoFormula = tipoFormula;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }


}

