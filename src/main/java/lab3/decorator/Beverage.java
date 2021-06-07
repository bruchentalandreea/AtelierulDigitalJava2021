package lab3.decorator;

public abstract class Beverage {
    protected static String description;
    protected  static int cost;

    public Beverage(String description, int cost) {

        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
