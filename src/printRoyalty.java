import javax.sound.midi.Soundbank;
import java.text.DecimalFormat;

public class printRoyalty {

    public static void run(){
        Publisher.initializeRates();

        //Author author1 = new Author("Anne");


        Author author1 = new Author("Anne Hamilton");
        Author author2 = new Author("John Travioli");
        Author author3 = new Author("Jane Dolittle");

        PrintedBook uheldig = new PrintedBook("Uheldig", "BI", 50, 433);
        PrintedBook heldig = new PrintedBook("Heldig", "TE", 75, 328);
        AudioBook lort = new AudioBook("Lort", "LYRIK", 30, 180);

        author1.addTitle(uheldig);
        author1.addTitle(heldig);
        author1.addTitle(lort);

        AudioBook pastaASMR = new AudioBook("Pasta ASMR", "SKØN", 135, 180);
        AudioBook ravioliAndYou = new AudioBook("Ravioli and You", "BI", 26, 73);
        PrintedBook pestoMan = new PrintedBook("Pesto Man", "TE", 530, 65);

        author2.addTitle(pastaASMR);
        author2.addTitle(ravioliAndYou);
        author2.addTitle(pestoMan);

        PrintedBook petHealth = new PrintedBook("Pet Health", "FAG", 450, 604);
        PrintedBook parrotHandbook = new PrintedBook("Parrot Handbook", "FAG", 252, 267);
        PrintedBook SeaShanties = new PrintedBook("Sea Shanties", "SKØN", 77, 32);

        author3.addTitle(petHealth);
        author3.addTitle(parrotHandbook);
        author3.addTitle(SeaShanties);


        // final print of total amount paid to the author
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        // This is for testing book objects
        //DecimalFormat is for formatting numbers like the double variable with two decimals

        /*final DecimalFormat df1 = new DecimalFormat( "#.00" );

        System.out.println("The books title: " + book1.title);
        System.out.println("The books literature type: " + book1.literatureType);
        System.out.println("calculate points is not used" + book1.calculatePoints());
        System.out.println("The book is worth X amount of points: " + book1.calculateLiteraturePoints());
        System.out.println("The books worth in DKK: " + df1.format(book1.calculateRoyalty()));*/
    }
}
