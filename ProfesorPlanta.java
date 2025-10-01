package Model;

public class ProfesorPlanta extends Profesor{
    private String proyecto;
    private Dedicacion dedicacion;

    public enum Dedicacion{
        TIEMPO_COMPLETO,
        MEDIO_TIEMPO
    }

    public ProfesorPlanta(String identificador, String nombre, String tituloAcademico, int aniosExperiencia, String proyecto, Dedicacion dedicacion){
        super(identificador, nombre, tituloAcademico, aniosExperiencia);
        this.proyecto=proyecto;
        this.dedicacion=dedicacion;

    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public Dedicacion getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(Dedicacion dedicacion) {
        this.dedicacion = dedicacion;
    }
}
