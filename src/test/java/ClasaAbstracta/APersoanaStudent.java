package ClasaAbstracta;

public class APersoanaStudent extends Persoana{
    @Override
    public void mergeLaCursuri() {
        System.out.println("Merge la cursuri");
    }

    @Override
    public void invata() {
        System.out.println("Invata");
        esteMajora();

    }

    @Override
    public void munceste() {

    }

    @Override
    public void primesteSalariu() {

    }
}
