/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Rodrigo
 */
public class EmpleadoNoEncontradoException extends Exception{
    public EmpleadoNoEncontradoException(String mensaje){
        super(mensaje);
    }
    public EmpleadoNoEncontradoException(){}
    
}
