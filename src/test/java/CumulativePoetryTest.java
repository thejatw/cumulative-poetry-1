import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CumulativePoetryTest {

    @Test
    void testCumulativePoetryForDayOne() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry();

        String dayOne = "This is the house that Jack built.";
        assertEquals(dayOne, cumulativePoetry.getLineForDay(1));
    }

    @Test
    void testCumulativePoetryForDayTwo() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry();

        String dayTwo = "This is the malt that lay in\n\tthe house that Jack built.";
        assertEquals(dayTwo, cumulativePoetry.getLineForDay(2));
    }

    @Test
    void testCumulativePoetryForDayThree() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry();

        String dayTwo = "This is the rat that ate"
                        + "\n\tthe malt that lay in"
                        + "\n\tthe house that Jack built.";
        assertEquals(dayTwo, cumulativePoetry.getLineForDay(3));
    }

    @Test
    void testCumulativePoetryForDayFour() {
        CumulativePoetry cumulativePoetry = new CumulativePoetry();

        String dayTwo = "This is the cat that killed"
                        + "\n\tthe rat that ate"
                        + "\n\tthe malt that lay in"
                        + "\n\tthe house that Jack built.";
        assertEquals(dayTwo, cumulativePoetry.getLineForDay(4));
    }
}
