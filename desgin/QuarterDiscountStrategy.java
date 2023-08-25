package desgin;

public class QuarterDiscountStrategy  implements  IPromoteStrategy{
    @Override
    public double DoDiscount(double price) {
        return price *0.75;
    }
}
