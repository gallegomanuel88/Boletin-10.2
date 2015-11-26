package bol.pkg10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {
    
    int numeroAleatorio = (int) (Math.random()*50);
    int numeroIntentos;
    
    public void imprimirDatos (String imprimir){
        JOptionPane.showMessageDialog(null, imprimir);
    }
    
    public int introduccionDatos (String introducir){
        do {
            numeroIntentos = Integer.parseInt(JOptionPane.showInputDialog(introducir));
        } while (numeroIntentos < 1);
        return numeroIntentos;
    }

    public void comparar() {

        numeroIntentos = introduccionDatos ("Jugador 1: Introduce numero de intentos para el jugador 2");
        int perdiste = 0; //0 perdiste;
       
        for (int i = 0; i < numeroIntentos; i++) {
            int numRespuesta = introduccionDatos("Adivina un numero entre el 1 y el 50");
            if (numRespuesta > (numeroAleatorio+20)|numRespuesta < (numeroAleatorio-20)) {
                imprimirDatos("¡¡¡INCORRECTO!!! Muy lejos");
            } 
            else if (numRespuesta >= (numeroAleatorio+10)|numRespuesta <= (numeroAleatorio-10)) {
                imprimirDatos("¡¡¡INCORRECTO!!! Lejos");
            }
            else if (numRespuesta > (numeroAleatorio+5)|numRespuesta < (numeroAleatorio-5)) {
                imprimirDatos("¡¡¡INCORRECTO!!! Cerca");
            }
            else if (numRespuesta > (numeroAleatorio)|numRespuesta < (numeroAleatorio)) {
                imprimirDatos("¡¡¡INCORRECTO!!! Muy cerca");
            }
            else if (numRespuesta == numeroAleatorio) {
                imprimirDatos("Has acertado");
                perdiste = 1;
                break;
            }

        }
        if (perdiste == 0){
            imprimirDatos("Perdiste, numero de intentos agotados");
        }
    }
}

