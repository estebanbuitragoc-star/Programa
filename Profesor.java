package Model;

import java.util.ArrayList;

public abstract class Profesor {
    private String identificador;
    private String nombre;
    private String tituloAcademico;
    private int aniosExperiencia;
    private ArrayList<Materia> listaMaterias;
     public Profesor(String identificador, String nombre, String tituloAcademico, int aniosExperiencia){
         this.identificador=identificador;
         this.nombre=nombre;
         this.tituloAcademico=tituloAcademico;
         this.aniosExperiencia=aniosExperiencia;
         this.listaMaterias= new ArrayList<>();
     }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}
