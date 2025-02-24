public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public float cost() {
        return 1.99f;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
