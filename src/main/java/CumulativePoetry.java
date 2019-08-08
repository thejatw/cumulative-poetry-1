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

        lineForDay[0] = "the horse and the hound and the horn that belonged to";
        lineForDay[1] = "the farmer sowing his corn that kept";
        lineForDay[2] = "the rooster that crowed in the morn that woke";
        lineForDay[3] = "the priest all shaven and shorn that married";
        lineForDay[4] = "the man all tattered and torn that kissed";
        lineForDay[5] = "the maiden all forlorn that milked";
        lineForDay[6] = "that cow with the crumpled horn that tossed";
        lineForDay[7] = "the dog that worried";
        lineForDay[8] = "the cat that killed";
        lineForDay[9] = "the rat that ate";
        lineForDay[10] = "the malth that lay in";
        lineForDay[11] = "the house that Jack built.";
    }

    public String getLineForDay(int day) {
        return "This is the house that Jack built.";
    }
}
