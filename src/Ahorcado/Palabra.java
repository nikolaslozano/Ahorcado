/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Palabra {
    String palabra[]={"ESCALERA","COMPUTADOR","CARRETERA","TRANSMILENIO","PUERTA","SOLITARIO","CALCULADORA","BUSCAMINAS","VENTANA","PLAZA","PARQUE","PERSONA","ZAPATO","CHAPINERO","CUADERNO","PROYECTO","SOLIDARIDAD","BICICLETA","APARTAMENTO","SINCERIDAD"};
    
    Random palabraRandom = new Random();
    
    String seleccionarPalabra(){
        int posición=palabraRandom.nextInt(20);
        return palabra[posición];
    }
}
