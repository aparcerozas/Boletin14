/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author aparcerozas
 */
public class TemperaturaErradaExcepcion {
    public static void temperaturaExcepcion(double graos){
        if(graos < 80){
            throw new ArithmeticException("A temperatura non pode ser menor de 80 graos");
        }
    }
    
    
}
