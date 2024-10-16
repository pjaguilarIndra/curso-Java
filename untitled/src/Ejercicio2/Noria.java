package Ejercicio2;

import javax.swing.*;

public class Noria implements Atraccion {
    private double precio;

    public Noria(double precio) {
        this.precio = precio;
    }

    @Override
    public void montarse() {
        JOptionPane.showMessageDialog(null,"Se ve todo desde aquí en la noria");

    }

    @Override
    public double cobrar() {
        return precio;


    }
}