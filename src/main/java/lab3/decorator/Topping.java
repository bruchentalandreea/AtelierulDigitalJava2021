package lab3.decorator;

public abstract class Topping extends Beverage{
    private Beverage mainBeverage;

    public Topping(Beverage mainBeverage) {
        super(description,
                cost);
        this.mainBeverage = mainBeverage;
    }


}
