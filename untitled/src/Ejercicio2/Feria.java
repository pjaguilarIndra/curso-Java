package Ejercicio2;

import javax.swing.*;

public class Feria {
    static double precioBarco=2.50;
    static double precioNoria=5;
    public static void main(String[] args) {
        Persona persona = new Persona(Double.parseDouble(JOptionPane.showInputDialog("Buenos días \n ingrese el dinero que tiene en €: ")));
        int numeroAtracciones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas veces te quieres montar en atracciones?"));
        Atraccion[] atracciones = new Atraccion[numeroAtracciones];
        boolean suficienteDinero=true;

        for (int i = 0; i < numeroAtracciones && suficienteDinero; i++) {

            boolean volver=true;
            do {
                String eleccion = JOptionPane.showInputDialog("¿En qué deseas montarte ahora? (barco/noria)");
                if (eleccion.equalsIgnoreCase("barco")) {

                    atracciones[i]=new Barcos(precioBarco);
                    volver=false;

                } else if (eleccion.equalsIgnoreCase("noria")) {
                    atracciones[i]=new Noria(precioNoria);
                    volver=false;

                }
                else {
                    JOptionPane.showMessageDialog(null, "elige bien una opción por favor y gracias","ATENCIÓN",JOptionPane.WARNING_MESSAGE);
                }
            }while(volver);
            if(persona.pagar(atracciones[i].cobrar()))
                atracciones[i].montarse();
            else
                suficienteDinero=false;

        }
        JOptionPane.showMessageDialog(null, "Esperamos que haya disfrutado en la feria de Torrejón de Ardoz");



    }

}
