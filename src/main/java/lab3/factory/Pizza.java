package lab3.factory;

public class Pizza {
    private String name;
    private String daugh;
    private String topping;

    public Pizza(String name, String daugh, String topping) {
        this.name = name;
        this.daugh = daugh;
        this.topping = topping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDaugh() {
        return daugh;
    }

    public void setDaugh(String daugh) {
        this.daugh = daugh;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", daugh='" + daugh + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    public void bake()
    {
        System.out.println("Pizza" + name );
    }

    public void cut()
    {
        System.out.println("Cut Pizza" + name );
    }

    public void box()
    {
        System.out.println("Box Pizza" + name );
    }

}
