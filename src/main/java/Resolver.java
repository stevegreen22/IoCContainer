import java.util.Random;

/**
 * Created by SteveGreen on 29/05/15.
 */
public class Resolver {

    public ICreditCard ResolveCreditCard() {
        if (new Random().nextInt(2) == 1){
            return new Visa();
        }
        return new MasterCard();
    }
}
