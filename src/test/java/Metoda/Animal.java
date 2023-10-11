package Metoda;

import org.testng.annotations.Test;

public class Animal {
    public String nume;
    public String rasa;

    @Test
    public void metodaTest() {
        calculDouaNumere(2,3);
        calculDouaNumere(4,0);
        System.out.println(getSalariu());

    }

    //Calculam suma a 2 numere cu algoritm
    public void calculDouaNumere(int param1, int param2){

        int suma = param1 + param2;
        System.out.println("Suma celor doua numere este: " + suma);

    }

    //Metoda cu return
    public int getSalariu (){
        int salariu = 20000;
        return salariu;
    }

}
