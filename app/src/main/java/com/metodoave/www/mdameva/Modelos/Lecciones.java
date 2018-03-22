package com.metodoave.www.mdameva.Modelos;

/**
 * Created by ISA on 3/15/2018.
 */

public class Lecciones {

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(String preguntas) {
        Preguntas = preguntas;
    }

    public Lecciones(String description, String preguntas) {
        Description = description;
        Preguntas = preguntas;
    }

    private String Description;
    private String Preguntas;
}
