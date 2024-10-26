public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public float cost() {
        return 1.05f;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
