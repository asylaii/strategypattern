import java.util.Currency;
import java.math.BigDecimal;
public class main {

    public static void main(String[] args) {

        Currency currency = new Currency(new BigDecimal("1500"));

        context dollars = new context(new Dollars());
        context rubles = new context(new Rubles());
        context som = new context(new Som());

        System.out.println(dollars.calculateCurrency(currency));
        System.out.println(rubles.calculateCurrency(currency));
        System.out.println(som.calculateCurrency(currency));


    }
}
