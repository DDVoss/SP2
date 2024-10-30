import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> titles = new ArrayList<Title>();

    public Author(String name) {
        this.name = name;

    }

    public void addTitle(Title title) {
        this.titles.add(title);
    }

    public float calculateTotalPay()    {
        float total = 0;
        total += this.titles.size();
        return total;
    }
}
