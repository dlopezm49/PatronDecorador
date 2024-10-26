public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public float cost() {
        return 0.99f;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
