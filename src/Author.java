import java.text.DecimalFormat;
import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> titles;


    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<Title>();
    }

    public String getName() {
        return name;
    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public double calculateTotalPay()    {
        double total = 0;

        for (Title title : titles) {
            total += (double) title.calculateRoyalty();
        }
        return total;
    }

    @Override
    public String toString() {
        final DecimalFormat df1 = new DecimalFormat( "#.00" );
        return "Author: " + this.name + " " +  df1.format(calculateTotalPay()) + " DKK";
    }
}
