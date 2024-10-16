package Ejercicio2;

import javax.swing.*;

public class Barcos implements Atraccion{

    private double precio;

    public Barcos(double precio) {
        this.precio = precio;
    }
    @Override
    public void montarse() {
        int valorDado = (int)Math.floor(Math.random()*2+1);
        if (valorDado==2)
        {
            JOptionPane.showMessageDialog(null,"Nooooo se me olvidó el chubasquero, saldré empapado");

        }
        else{
            JOptionPane.showMessageDialog(null,"Al de al lado se le olvidó el chubasquero jajajajaja");


        }


    }

    @Override
    public double cobrar() {
        return precio;

    }
}
