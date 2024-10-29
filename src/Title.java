public abstract class Title {

    private String title;
    private String literatureType;
    private int copies;

    private double rate;

        Title(String title, String literatureType, int copies) {
            this.title = title;
            this.literatureType = literatureType;
            this.copies = copies;
        }

    public double calculateRoyalty() {
        return 0;
    }

    abstract double calculatePoints();
        abstract double calculateLiteraturePoints();

}
