import java.util.Currency;
import java.math.BigDecimal;
public class context {
    private CurrencyConverter currencyConverter;

    public context(CurrencyConverter currencyConverter) { this.currencyConverter = currencyConverter; }
    public BigDecimal calculateCurrency(Currency currency) { return currencyConverter.calculate(currency); }
}
