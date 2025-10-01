package Exceptions;

public class DuplicateEntityException extends Exception{
    public DuplicateEntityException(String mensaje){
        super(mensaje);
    }
}
