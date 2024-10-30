import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Publisher.initializeRates();

        Author author1 = new Author("Anne");
        Author author2 = new Author("John");
        Author author3 = new Author("Jane");

/*
        Author t = new Author();
        t.addTitle(book1);
*/
        PrintedBook book1 = new PrintedBook("Uheldig", "BI", 5, 5);

        // This is for testing book objects
        System.out.println(book1.title);
        System.out.println(book1.literatureType);
        System.out.println(book1.calculatePoints());
        System.out.println(book1.calculateLiteraturePoints());
    }

}
