import Models.Actor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//nazwy metod muszą mieć w nazwie TEST
//metoda musi być voidowa
public class ActorTest {
    @Test
    void shouldCalculateCorrectSalary() {
        Actor tomHanks = new Actor("Tom", "Hanks");
        int actual = tomHanks.calculateSalary(3, 3);
        int expected = 9;

        //serce testu
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void shouldCalculateBonus() {
        Actor tomHanks = new Actor("Tom", "Hanks");
        int actual = tomHanks.giveBonus(10,10000);
        int expected =20000;
        assertThat(actual).as("Bonus policzony nie prawidłowo").isEqualTo(expected);
    }

    @Test
    void shouldCalculateBonusForRatingGraterThan10() {
        Actor tomHanks = new Actor("Tom", "Hanks");
        int actual = tomHanks.giveBonus(11,10000);
        int expected =10000;
        assertThat(actual).as("Bonus policzony nie prawidłowo").isEqualTo(expected);
    }

}

