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
    String palabra[]={"ESCALERA","COMPUTADOR","CARRETERA","TRANSMILENIO","PUERTA","SOLITARIO","CALCULADORA","BUSCAMINAS","VENTANA","PLAZA","PARQUE","PERSONA","ZAPATO","CHAPINERO","CUADERNO","PROYECTO","SOLIDARIDAD","BICICLETA","APARTAMENTO","SINCERIDAD","COMPLEJIDAD","CELULAR","ALCALDE","COLOMBIA","EDIFICIO","SACERDOTE","IGLESIA","BUS","SOL","SAL","ARMARIO","CIELO","NOCTURNO","CELESTE","SATURNO","ESPACIO","CATASTRO","PROGRAMAR","ANIMADOR","PAYASO","PROFESOR","HIERRO","GRECIA","FOTOCOPIA","TINTO","PLANTA","BOMBILLO","ESPONJA","ELASTICIDAD","ESCUELA","TORMENTA","CALLE","CAMINATA","HABITANTE","PRESIDENTE","DURABILIDAD","ESPECIALISTA","COMIDA","DESAYUNO","CIUDADELA","PAÑUELO","EGIPTO","DIOS","CORREO","PORTAL","AREQUIPE","SOPA","PERRO","TECLADO","MONITOR","SALUBRIDAD","GENEROSIDAD","EMPLEO","CHAQUETA","CINTA","ESCRITORIO","OSCURIDAD","NAVIDAD","FERIA","HOMERO","OPERADOR","REVISTA","PIÑA","COLADA","CEMENTERIO","SABORIZANTE","CORTO","ELECTRICIDAD","CARAMBA","BOMBERO","JAVERIANA","DISTRITAL","NACIONAL","PROVIDENCIA","DINERO","PEÑALOSA","TREN","EXTRATERRESTRE","ASTEROIDE","TETRIS"};
    
    Random palabraRandom = new Random();
    
    String seleccionarPalabra(){
        int posición=palabraRandom.nextInt(100);
        return palabra[posición];
    }
}
