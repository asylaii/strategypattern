


//converts tenge to rubles, dollars, soms

import java.math.BigDecimal;
public interface CurrencyConverter {
    BigDecimal calculate(Currency currency);
    }
    public class Dollars implements CurrencyConverter {
        public BigDecimal calculate(Currency currency) {
            return currency.getMoney().multiply(Money.valueOf(0.002098));
        }
    }

    public class Rubles implements CurrencyConverter {

            public BigDecimal calculate(Currency currency) {
                return currency.getMoney().multiply(Money.valueOf(0.116));
            }
        }


    public class Som implements CurrencyConverter {
        public Money calculate(Currency currency) {
            return currency.getMoney().multiply(Money.valueOf(0.16813));
        }
}
