import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public abstract float cost();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
