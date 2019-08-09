public class CumulativePoetry {
    private static String[] lineForDay = {"the horse and the hound and the horn that belonged to",
            "the farmer sowing his corn that kept",
            "the rooster that crowed in the morn that woke",
            "the priest all shaven and shorn that married",
            "the man all tattered and torn that kissed",
            "the maiden all forlorn that milked",
            "that cow with the crumpled horn that tossed",
            "the dog that worried",
            "the cat that killed",
            "the rat that ate",
            "the malt that lay in",
            "the house that Jack built."
    };

    /**
     * Constructor
     */
    public CumulativePoetry() {
    }

    /**
     * Get poem line up to a specific day
     *
     * params:
     *   day: number of days up to which poem queried
     * returns:
     *   poem string up to day queries
     */
     public static String getLineForDay(int day) {
        StringBuilder poemForDay = new StringBuilder("This is ");
        int today = 12-day;
        while (today < 12) {
            poemForDay.append(lineForDay[today]);
            today++;

            if (today < 12) {
                poemForDay.append("\n\t");
            }
        }

        return poemForDay.toString();
    }

    public static void main(String[] args) {
         if (args.length == 0)
             throw new IllegalArgumentException("Too few arguments provided");

        if(args[0].equals("--recite")) {
            for(int day=1; day<=12; ++day) {
                System.out.println("Day " + day + " -\n" + getLineForDay(day));
            }
        }
        else if (args[0].equals("--reveal-for-day") && args.length==2) {
            int day = Integer.parseInt(args[1]);

            System.out.println(getLineForDay(day));
        }
        else {
            throw new IllegalArgumentException("Wrong argument format passed");
        }
    }
}
