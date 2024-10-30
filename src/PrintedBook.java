public class PrintedBook extends Title {
    private int pages;

    PrintedBook(String title, String literatureType, int copies, int pages)   {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    public double calculatePoints() {
        return 0;
    }

    @Override
    public double calculateLiteraturePoints() {
        return this.pages * Publisher.getPrintedBookRate(this.literatureType)  * this.copies;
    }
}
