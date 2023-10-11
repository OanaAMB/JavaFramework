package OOPMostenire;

public class Laptop {

    public String display;
    public String forma;
    public String model;
    public double pret;

    public Laptop(String display, String forma, String model, double pret) {
        this.display = display;
        this.forma = forma;
        this.model = model;
        this.pret = pret;
    }

    public void infoLaptop() {
        System.out.println("Display-ul laptopului este: " + display);
        System.out.println("Forma laptopului este: " + forma);
        System.out.println("Modelul laptopului este: " + model);
        System.out.println("Pretul laptopului este: " + pret);
    }
}
