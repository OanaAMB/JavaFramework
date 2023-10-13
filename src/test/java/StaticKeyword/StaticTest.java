package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){

        Elev Oana = new Elev("Borsan", "Oana", 28);
        Oana.prezentareElev();

        Elev Ruben = new Elev("Ivan", "Ruben", 28);
        Ruben.prezentareElev();

    }
}
