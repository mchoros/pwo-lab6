package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu lucasa
 * @author student
 */

public class LucasGenerator extends FibonacciGenerator {

    /**
     * Konstruktor klasy lucasa
     */
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Metoda reset
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
     * Generowanie kolejnej liczby lucasa
     * @return 
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
