public abstract class Condiment extends Beverage {
    protected Beverage beverage;

    public Condiment(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
