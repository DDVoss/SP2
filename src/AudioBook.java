import java.awt.print.Book;

public class AudioBook extends Title  {
    private int durationInMinutes;

    AudioBook(String title, String literatureType, int copies, int durationInMinutes)   {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public double calculatePoints() {
        return 0;
    }

    @Override
    public double calculateLiteraturePoints() {
        return this.durationInMinutes * Publisher.getAudioBookRates(this.literatureType) * this.copies;
    }
}
