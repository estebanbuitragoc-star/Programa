package Model;

public class EstudiantePostGrado extends Estudiante{
    private String temaInvestigacion;
    private Curso curso;
    public enum Curso{
        MAESTRIA,
        DOCTORADO
    }
    public EstudiantePostGrado(String identificador,String nombre, String documentoIdentidad,
                               String programaAcademico, String semestre,String temaInvestigacion, Curso curso){
        super(identificador, nombre, documentoIdentidad, programaAcademico, semestre);
        this.temaInvestigacion=temaInvestigacion;
        this.curso=curso;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
