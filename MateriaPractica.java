package Model;

public class MateriaPractica extends Materia{
    private int horasPractica;
    private int numeroLaboratorios;

    public MateriaPractica(String codigo,String nombre,int horas, int creditos, String semestre, int horasPractica, int numeroLaboratorios, Profesor profesor){
        super(codigo, nombre, horas, creditos, semestre, profesor);
        this.horasPractica=horasPractica;
        this.numeroLaboratorios=numeroLaboratorios;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getNumeroLaboratorios() {
        return numeroLaboratorios;
    }

    public void setNumeroLaboratorios(int numeroLaboratorios) {
        this.numeroLaboratorios = numeroLaboratorios;
    }
}
