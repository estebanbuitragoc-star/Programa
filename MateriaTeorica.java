package Model;

public class MateriaTeorica extends Materia{
    private int numeroExposiciones;

    public MateriaTeorica(String codigo,String nombre,int horas, int creditos, String semestre,int numeroExposiciones,Profesor profesor ){
        super(codigo, nombre, horas, creditos, semestre, profesor);
        this.numeroExposiciones=numeroExposiciones;
    }

    public int getNumeroExposiciones() {
        return numeroExposiciones;
    }

    public void setNumeroExposiciones(int numeroExposiciones) {
        this.numeroExposiciones = numeroExposiciones;
    }
}
