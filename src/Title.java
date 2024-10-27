public abstract class Title {
    private String title;
    private int literatureTypePoints;
    public int copies;
    public double rate;
        Title(String title, String literatureType, int copies) {
            this.title = title;
            this.literatureType = literatureType;
            this.copies = copies;
        }

    public abstract double calculateRoyalty();

}
