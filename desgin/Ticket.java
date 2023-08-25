package desgin;

public class Ticket {
    private IPromoteStrategy _promoteStrategy;
    private double price;
    private String name;

    public IPromoteStrategy getPromoteStrategy() {
        return _promoteStrategy;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy) {
        this._promoteStrategy = promoteStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  Ticket(){

    }

    public Ticket(IPromoteStrategy promoteStrategy){
        _promoteStrategy =promoteStrategy;
    }

    public  double GetPromotedPrice(){
        return  _promoteStrategy.DoDiscount(price);
    }
}
