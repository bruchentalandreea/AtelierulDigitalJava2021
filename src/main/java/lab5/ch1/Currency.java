package lab5.ch1;

public abstract class Currency {
    private String name;
    private float value;

    public Currency() {
    }

    public Currency(String name, float value) {
        this.name = name;
        this.value = value;
    }
    public Currency(float value) {
        this.value = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
