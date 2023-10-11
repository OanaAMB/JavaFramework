package ClasaAbstracta;

public abstract class Persoana {

    //recunoastem clasa abstracta dupa cuvantul abstract
    //poate sau nu sa contina metode abstracte
    //metodele pot sa fie de tipul void si return
    //putem avea constructor=> nu putem face un obiect dintr-o clasa abstracta
    //o clasa abstracta se mosteneteste
    //clasa care mostenste clasa abstracta trebuie sa implementeze metodele abstracte
    //ca sa facem o metoda abstracta adaugam cuvantul abstract
    //putem avea diferite access control-uri pentru diferite metode: public, private

    public abstract void mergeLaCursuri();

    public abstract void invata();

    public abstract void munceste();
    public abstract void primesteSalariu();

    public void esteMajora(){
        System.out.println("Persoana este majora.");

    }


}
