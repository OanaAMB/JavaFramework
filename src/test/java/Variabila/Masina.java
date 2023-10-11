package Variabila;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Masina {

    public String marca;
    public String model;
    public int anul;
    public String cutieViteza;
    public float motor;
    public double consumUrban;
    public SimpleDateFormat inmatriculare;
    public boolean areVin;


@Test
    public void afiseazaDate(){
        marca="Alfa Romeo";
        model="Giulietta";
        anul=2011;
        cutieViteza="manuala";
        motor=1.8f;
        consumUrban=9.5;
        inmatriculare = new SimpleDateFormat("03-20-2020");
        areVin=true;

        System.out.println("Marca si modelul masinii: " + marca + " " + model);
        System.out.println("Anul fabricatiei: " + anul);
        System.out.println("Cutie viteza: " + cutieViteza);
        System.out.println("Motor: " + motor);
        System.out.println("Consumul urban: " + consumUrban);
        System.out.println("Ultima inmatriculare: " + inmatriculare.toLocalizedPattern());
        System.out.println("Are VIN (serie sasiu)? " + areVin);
    }
}
