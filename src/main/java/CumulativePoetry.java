public class CumulativePoetry {
    private String[] lineForDay;

    /**
     * Constructor
     */
    public CumulativePoetry() {
        populateLines();
    }

    /**
     * Allocate memory for lines of each day and populate them with respective lines in reverse chronological order
     */
    private void populateLines() {
        lineForDay = new String[12];

        lineForDay[11] = "the horse and the hound and the horn that belonged to";
        lineForDay[10] = "the farmer sowing his corn that kept";
        lineForDay[9] = "the rooster that crowed in the morn that woke";
        lineForDay[8] = "the priest all shaven and shorn that married";
        lineForDay[7] = "the man all tattered and torn that kissed";
        lineForDay[6] = "the maiden all forlorn that milked";
        lineForDay[5] = "that cow with the crumpled horn that tossed";
        lineForDay[4] = "the dog that worried";
        lineForDay[3] = "the cat that killed";
        lineForDay[2] = "the rat that ate";
        lineForDay[1] = "the malt that lay in";
        lineForDay[0] = "the house that Jack built.";
    }

    public String getLineForDay(int day) {
        StringBuilder poemForDay = new StringBuilder("This is ");

        while (day > 0) {
            poemForDay.append(lineForDay[day - 1]);
            day--;

            if (day > 0) {
                poemForDay.append("\n\t");
            }
        }

        return poemForDay.toString();
    }
}
