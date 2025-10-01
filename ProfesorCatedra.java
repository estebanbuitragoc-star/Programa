package Model;

public class ProfesorCatedra extends Profesor{
    private int horasContratadas;

    public ProfesorCatedra(String identificador, String nombre, String tituloAcademico, int aniosExperiencia, int horasContratadas){
        super(identificador, nombre, tituloAcademico, aniosExperiencia);
        this.horasContratadas=horasContratadas;
    }

    public int getHorasContratadas() {
        return horasContratadas;
    }

    public void setHorasContratadas(int horasContratadas) {
        this.horasContratadas = horasContratadas;
    }
}
