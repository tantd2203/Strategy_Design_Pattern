package desgin;

public class NoDiscountStrategy implements IPromoteStrategy {
    @Override
    public double DoDiscount(double price) {
        return price;
    }
}
