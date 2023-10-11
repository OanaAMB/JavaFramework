package Polimorfism;

public class Pisica extends Animal{
    public Pisica(String nume, String rasa, Integer varsta) {
        super(nume, rasa, varsta);
    }



    public void mananca(String mancare) {
        System.out.println("Pisica mananca catfood si" + mancare);
    }

}
