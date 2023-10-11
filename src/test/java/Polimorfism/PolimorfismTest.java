package Polimorfism;

import org.testng.annotations.Test;

public class PolimorfismTest {

    @Test
    public void metodaTest() {
        Caine labrador = new Caine("Muki", "labrador", 8);
        labrador.faceSunet();

    }
}
