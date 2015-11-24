package bol.pkg10.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Calculos {
    
    int numeroAleatorio = (int) (Math.random()*50);
    int numeroIntentos;
    
    public int introduccionIntentos (){
        do {
            numeroIntentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1: Introduce numero de intentos para el jugador 2"));
        } while (numeroIntentos < 1);
        return numeroIntentos;
    }

    public void comparar() {

        numeroIntentos = introduccionIntentos ();
        int perdiste = 0; //perdiste;
       
        for (int i = 0; i < numeroIntentos; i++) {
            int numRespuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivina un numero entre el 1 y el 50"));
            if (numRespuesta > (numeroAleatorio+20)|numRespuesta < (numeroAleatorio-20)) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Muy lejos");
            } 
            else if (numRespuesta >= (numeroAleatorio+10)|numRespuesta <= (numeroAleatorio-10)) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Lejos");
            }
            else if (numRespuesta > (numeroAleatorio+5)|numRespuesta < (numeroAleatorio-5)) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Cerca");
            }
            else if (numRespuesta > (numeroAleatorio)|numRespuesta < (numeroAleatorio)) {
                JOptionPane.showMessageDialog(null, "¡¡¡INCORRECTO!!! Muy cerca");
            }
            else if (numRespuesta == numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Has acertado");
                perdiste = 1;
                break;
            }

        }
        if (perdiste == 0){
            JOptionPane.showMessageDialog(null, "Perdiste, numero de intentos agotados");
        }
    }
}

