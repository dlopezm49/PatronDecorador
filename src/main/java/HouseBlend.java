public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public float cost() {
        return 0.89f;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
