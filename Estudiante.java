package Model;

public abstract class Estudiante {
    private String identificador;
    private String nombre;
    private String documentoIdentidad;
    private String programaAcademico;
    private String semestre;

    public Estudiante (String identificador,String nombre, String documentoIdentidad, String programaAcademico, String semestre){
        this.identificador=identificador;
        this.nombre=nombre;
        this.documentoIdentidad=documentoIdentidad;
        this.programaAcademico=programaAcademico;
        this.semestre=semestre;
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

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
