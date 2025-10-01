package Model;

import Exceptions.CodigoInvalidoException;
import Exceptions.HorasInvalidasException;
import Exceptions.CreditosInvalidosException;

public abstract class Materia {
    private String codigo;
    private String nombre;
    private int horas;
    private int creditos;
    private String semestre;
    private Profesor profesor;


    public Materia(String codigo,String nombre,int horas, int creditos, String semestre,Profesor profesor)
        throws CodigoInvalidoException, HorasInvalidasException, CreditosInvalidosException{
        if (codigo==null || codigo.isBlank()){
            throw new CodigoInvalidoException("El código de la materia no puede estar vacío.");
        }
        if (horas<=0){
            throw new HorasInvalidasException("Las horas de la materia deben ser mayores a 0.");
        }
        if (creditos<=0){
            throw new CreditosInvalidosException("La cantidad de creditos debe ser mayor a 0.");
        }
        this.codigo=codigo;
        this.nombre = nombre;
        this.horas=horas;
        this.creditos=creditos;
        this.semestre = semestre;
        this.profesor= profesor;
    }

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) throws CodigoInvalidoException {
        if (codigo == null || codigo.isBlank()) {
            throw new CodigoInvalidoException("El código de la materia no puede estar vacío.");
        }
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) throws HorasInvalidasException{
        if (horas<=0){
            throw new HorasInvalidasException("Las horas de la materia deben ser mayores a 0.");
        }
        this.horas=horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos( int creditos) throws CreditosInvalidosException{
        if (creditos<=0){
            throw new CreditosInvalidosException("La cantidad de creditos debe ser mayor a 0.");
        }
        this.creditos=creditos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}
