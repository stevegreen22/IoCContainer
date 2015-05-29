
/**
 * Created by SteveGreen on 29/05/15.
 */
public class MainDriver {

    public static void main(String[] args) {

        //Basic DI using a constructor.
        for (int i = 0; i < 10; i++) {
            Resolver resolver = new Resolver();
            Shopper shopper = new Shopper(resolver.ResolveCreditCard());

            //Shopper shopper = new Shopper(otherCreditCard);
            shopper.Charge();
        }

    }
}
