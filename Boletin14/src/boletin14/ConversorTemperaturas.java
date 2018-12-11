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
public class ConversorTemperaturas {
    final private float max = 80f;
    
    public double centigradosAFahrenheit(float graos){
        TemperaturaErradaExcepcion.temperaturaExcepcion(graos);
        float f = (float)(9/5 * graos + 32.4);
        return f;
    }
    
    public double centigradosAReamur(float graos){
        TemperaturaErradaExcepcion.temperaturaExcepcion(graos);
        float r = (float)(4/5 * graos);
        return r;
    }
}
