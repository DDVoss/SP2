import java.util.HashMap;

// Publisher class holds all point rates in a hashmap for printed and audio books.

public class Publisher
{
    static HashMap<String, Double> printedBookRates = new HashMap<String, Double>();
    static HashMap<String, Double> audioBookRates = new HashMap<String, Double>();

    // initialiseRates are called in main to instantiate the HashMap
    public static void initializeRates() {

        // initialize printedBookRates
        printedBookRates.put("BI", 3.0);
        printedBookRates.put("TE", 3.0);
        printedBookRates.put("LYRIK", 6.0);
        printedBookRates.put("SKØN", 1.7);
        printedBookRates.put("FAG", 1.0);

        // initialize audioBookRates
        audioBookRates.put("BI", 1.5);
        audioBookRates.put("TE", 1.5);
        audioBookRates.put("LYRIK", 3.0);
        audioBookRates.put("SKØN", 0.85);
        audioBookRates.put("FAG", 0.5);

    }

    // GetPrintedBookRate is called in PrintedBook when calculating the total amount of literaturePoints for a single book
    public static double getPrintedBookRate(String key)  {
        return printedBookRates.get(key);
    }
    // Same as getPrintedBookRate just with AudioBook
    public static double getAudioBookRates(String key)  {
        return audioBookRates.get(key);
    }
}
