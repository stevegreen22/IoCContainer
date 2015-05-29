

public class Shopper{

    private ICreditCard creditCard;

    public Shopper(ICreditCard creditCard){
        this.creditCard = creditCard;
    }

    public void Charge(){
        System.out.println(creditCard.Charge());
    }

}