package Interfete;

public class PersoanaStudent extends Persoana implements StudentInt{
    public PersoanaStudent(String nume, String prenume, String varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void invata() {
        System.out.println("Studentul invata");
    }

    @Override
    public void iaBursa() {
        System.out.println();

    }

    @Override
    public void daExamene() {

    }
}
