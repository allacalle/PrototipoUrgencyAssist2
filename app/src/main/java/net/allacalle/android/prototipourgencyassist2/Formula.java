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
    private  Parametro [] parametros;

    //Aqui empiezan los getter y setters sencillos de la clase.

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
//Aqui acaban los getter y setter sencillos de la clase


    /*

    PROC contarPametros() DEV int
    REQUIERE:
    MODIFICA:
    EFECTOS: Muestra el numero de parametros de una formula

     */

    public int contarParametros()
    {
        return parametros.length ;
    }




}

