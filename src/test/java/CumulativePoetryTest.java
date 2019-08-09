import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CumulativePoetryTest {

    @Test
    void testCumulativePoetryForDayOne() {

        String dayOne = "This is the house that Jack built.";
        assertEquals(dayOne, CumulativePoetry.getLineForDay(1));
    }

    @Test
    void testCumulativePoetryForDayTwo() {

        String dayTwo = "This is the malt that lay in\n\tthe house that Jack built.";
        assertEquals(dayTwo, CumulativePoetry.getLineForDay(2));
    }

    @Test
    void testCumulativePoetryForDayThree() {

        String dayTwo = "This is the rat that ate"
                        + "\n\tthe malt that lay in"
                        + "\n\tthe house that Jack built.";
        assertEquals(dayTwo, CumulativePoetry.getLineForDay(3));
    }

    @Test
    void testCumulativePoetryForDayFour() {

        String dayTwo = "This is the cat that killed"
                        + "\n\tthe rat that ate"
                        + "\n\tthe malt that lay in"
                        + "\n\tthe house that Jack built.";
        assertEquals(dayTwo, CumulativePoetry.getLineForDay(4));
    }
}
