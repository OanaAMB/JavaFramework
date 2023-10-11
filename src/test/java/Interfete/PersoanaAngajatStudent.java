package Interfete;

public class PersoanaAngajatStudent extends Persoana implements AngajatInt, StudentInt {
    public PersoanaAngajatStudent(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println("Angajatul student munceste");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul student primeste salariu");

    }

    @Override
    public void isiIaConcediu() {
        System.out.println("Angajatul student isi ia concediu");

    }

    @Override
    public void invata() {
        System.out.println("Angajatul student invata");

    }

    @Override
    public void iaBursa() {
        System.out.println("Angajatul student ia bursa");

    }

    @Override
    public void daExamene() {
        System.out.println("Angajatul student da examene");

    }
}
