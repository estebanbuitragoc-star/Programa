package Model;

public class EstudiantePregrado extends Estudiante{
    private String tipoBeca;
    private double promedio;

    public EstudiantePregrado(String identificador,String nombre, String documentoIdentidad,
                              String programaAcademico, String semestre, String tipoBeca,double promedio){
        super(identificador, nombre, documentoIdentidad, programaAcademico, semestre);
        this.tipoBeca=tipoBeca;
        this.promedio=promedio;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
