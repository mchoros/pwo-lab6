package pwo.seq;

import java.math.BigDecimal;

/**
 * Klasa generatora ciągu Tribonacciego
 * @author student
 */

public class TribonacciGenerator extends FibonacciGenerator {

    
    /**
     * Konstruktor klasy tribonacciego
     */
    public TribonacciGenerator() {
        f_3 = new BigDecimal(0);
    }

    /**
     * Metoda reset
     */
    @Override
    public void reset() {
        super.reset();
        f_3 = new BigDecimal(0);
    }

    /**
     * Generowanie kolejnej liczby tribonacciego
     * @return 
     */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 2) {
            current = f_1.add(f_2).add(f_3);
            f_3 = f_2;
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 2) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }
        lastIndex++;
        return current;
    }
}
