package Obiect;

import org.testng.annotations.Test;

public class MasinaFabricaTest {

    @Test
     public void metodaTest (){
        MasinaFabrica audiA3 = new MasinaFabrica ("audi","A3",
                2023, "electrica", "mov");
        audiA3.prezentareMasina();

        MasinaFabrica bmwSeria1 = new MasinaFabrica("bmw", "Seria1",
                2023, "benzina","negru");
        bmwSeria1.prezentareMasina();

        MasinaFabrica volvoV40 = new MasinaFabrica("volvo", "V40", 2024,
                "hybrid", "alb", 20000);
        volvoV40.prezentareMasina();
    }
}
