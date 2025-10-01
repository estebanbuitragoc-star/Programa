package Exceptions;

public class InvalidDataException extends IllegalArgumentException{
    public InvalidDataException(String mensaje){
        super(mensaje);
    }
}
