package Model;

import Exceptions.EstudianteNoEncontradoException;
import Exceptions.MateriaNoEncontradaException;
import Exceptions.ProfesorNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String nombre;
    private ArrayList<Materia> listaMaterias;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Estudiante> listaEstudiantes;

    public Programa(String nombre){
        this.nombre=nombre;
        this.listaMaterias=new ArrayList<>();
        this.listaProfesores=new ArrayList<>();
        this.listaEstudiantes=new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    public void agregarMateria(Materia materia){
        listaMaterias.add(materia);
    }
    public void agregarProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }
    public void agregarEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    public Materia buscarMateria(String codigo) throws MateriaNoEncontradaException {
        return listaMaterias.stream().filter(materia -> materia.getCodigo().
                equalsIgnoreCase(codigo)).findFirst().orElseThrow(()-> new MateriaNoEncontradaException
                ("Materia con código " + codigo + " no encontrada."));
    }
    public Profesor buscarProfesor(String identificador) throws ProfesorNoEncontradoException {
        return listaProfesores.stream().filter(profesor -> profesor.
                getIdentificador().equalsIgnoreCase(identificador)).findFirst().
                orElseThrow(()->new ProfesorNoEncontradoException("Profesor con ID " + identificador + " no encontrado."));
    }
    public Estudiante buscarEstudiante(String documentoIdentidad) throws EstudianteNoEncontradoException {
        return listaEstudiantes.stream().filter(estudiante -> estudiante.
                getDocumentoIdentidad().equalsIgnoreCase(documentoIdentidad)).findFirst().
                orElseThrow(() -> new EstudianteNoEncontradoException("Estudiante con documento " + documentoIdentidad + " no encontrado."));
    }
    public void actualizarMateria(String codigo,Materia nuevaMateria)
    throws MateriaNoEncontradaException{
        final boolean[] actualizado= {false};
        listaMaterias.replaceAll(materia -> {
            if(materia.getCodigo().equalsIgnoreCase(codigo)){
                actualizado[0]=true;
                return nuevaMateria;
            }
            return materia;
        });
        if(!actualizado[0]){
            throw new MateriaNoEncontradaException("No se encontró materia con código: " + codigo);
        }
    }
    public void actualizarProfesor(String identificador,Profesor nuevoProfesor)throws ProfesorNoEncontradoException{
        final boolean[] actualizado ={false};
        listaProfesores.replaceAll(profesor -> {
            if(profesor.getIdentificador().equalsIgnoreCase(identificador)){
                actualizado[0]=true;
                return nuevoProfesor;
            }
            return profesor;
        });
        if(!actualizado[0]){
            throw new ProfesorNoEncontradoException("No se encontro profesor con identificador: "+identificador);
        }
    }
    public void actualizarEstudiante(String documentoIdentidad,Estudiante nuevoEstudiante)throws EstudianteNoEncontradoException{
        final boolean[] actualizado= {false};
        listaEstudiantes.replaceAll(estudiante -> {
            if(estudiante.getDocumentoIdentidad().equalsIgnoreCase(documentoIdentidad)){
                actualizado [0]= true;
                return nuevoEstudiante;
            }
            return estudiante;
        });
        if(!actualizado[0]){
            throw new EstudianteNoEncontradoException("No se encontro ningun estudiante con el documento" +
                    " de identidad: "+documentoIdentidad);
        }
    }
    public void eliminarMateria(String codigo)
    throws MateriaNoEncontradaException{
        boolean eliminado =listaMaterias.removeIf(materia -> materia.getCodigo().equalsIgnoreCase(codigo));
        if (!eliminado){
            throw new MateriaNoEncontradaException("No se encontró materia con código: " + codigo);
        }
    }
    public void eliminarProfesor(String identificador)throws ProfesorNoEncontradoException{
        boolean eliminado=listaProfesores.removeIf(profesor -> profesor.getIdentificador().
                equalsIgnoreCase(identificador));
        if (!eliminado){
            throw new ProfesorNoEncontradoException("No se encontro profesor con identificador: "+identificador);
        }
    }
    public void eliminarEstudiante(String documentoIdentidad)throws EstudianteNoEncontradoException{
        boolean eliminado=listaEstudiantes.removeIf(estudiante -> estudiante.
                getDocumentoIdentidad().equalsIgnoreCase(documentoIdentidad));
        if (!eliminado){
            throw new EstudianteNoEncontradoException("No se encontro ningun estudiante con el documento" +
                    " de identidad: "+documentoIdentidad);
        }

    }


}
