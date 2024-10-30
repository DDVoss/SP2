import java.util.HashMap;

public abstract class Title {

    protected String title;
    protected String literatureType;
    protected int copies;
    protected double rate;

    Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }


    public double calculateRoyalty() {
        return calculateLiteraturePoints() * rate;
    }

    protected abstract double calculatePoints();
    protected abstract double calculateLiteraturePoints();

}
