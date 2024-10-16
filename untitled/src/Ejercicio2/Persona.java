package Ejercicio2;

import javax.swing.*;

public class Persona {
    private double dinero; //dinero que tiene para gastarse
    public Persona (double dinero)
    {
        this.dinero=dinero;
    }
    boolean pagar(double precio) //si tiene suficiente dinero pagará
    {
        boolean pago =false;
        if(precio<=dinero)
        {
            dinero=dinero-precio;
            pago=true;
            JOptionPane.showMessageDialog(null,"pago realizado");
        }
        else {
            JOptionPane.showMessageDialog(null,"se acabó lo que se daba \n no tiene suficiente dinero","ATENCIÓN",JOptionPane.WARNING_MESSAGE);
        }
        return pago;

    }
}
