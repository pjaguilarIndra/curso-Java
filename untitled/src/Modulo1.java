import java.util.Scanner;

public class Modulo1 {


    /*
    Desafío Trabajando con Strings y Numéricos

Objetivo: Practicar la manipulación de Strings, numéricos y concatenación

Instrucciones:

    Define 4 variables: el nombre de una persona,  edad,  su ciudad de origen y una frase personalizada.
    Usa concatenación para formar una frase completa.
    Imprime la frase final.
    Sube tu código a un documento de texto o GitHub
    Entrega el link del desafío
     */
    public static void main(String[] args) {
        String nombre= "";
        int edad=0;
        String ciudad= "";
        String frase="";
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduzca su nombre por favor:");
        nombre= pedirString(teclado);
        System.out.println("Introduzca su edad por favor:");
        edad= pedirInt(teclado);
        System.out.println("Introduzca su ciudad de origen por favor:");
        ciudad= pedirString(teclado);
        teclado.close();
        frase= "Buenos días "+ nombre+ " se ha registrado que su edad es de " + edad+" años y su ciudad de origen es "
                +ciudad + " que pase un buen día :)";
        System.out.println(frase);



    }
    public static int pedirInt(Scanner teclado)
    {
        int numero=0;
        numero = teclado.nextInt();
        teclado.nextLine();
        return numero;
    }
    public static String pedirString(Scanner teclado)
    {
        String frase="";
        frase=teclado.nextLine();
        return frase;
    }

}
