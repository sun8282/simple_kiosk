package sample.beverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sample.cafekiosk.unit.beverage.Americano;

public class AmericanoTest {

    @Test
    void getName(){
        Americano americano = new Americano();

        Assertions.assertEquals(americano.getName(),"아메리카노");
        org.assertj.core.api.Assertions.assertThat(americano.getName()).isEqualTo("아메리카노");

    }
}
