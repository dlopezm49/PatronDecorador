public class Mocha extends Condiment {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return 0.20f + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
