package pwo.seq;

import java.math.BigDecimal;

/**
 * 
 * Klasa generatora ciągu fibonacciego
 * @author student
 */

public class FibonacciGenerator extends Generator {

    /**
     * Konstruktor klasy fibonacciego
     */
    
    public FibonacciGenerator() {
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    
    /**
     * Metoda reset
     */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(0);
        f_1 = new BigDecimal(1);
        f_2 = new BigDecimal(0);
    }

    /**
     * Generowanie kolejnej liczby fibonacciego
     * @return 
     */
    
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex > 1) {
            current = f_1.add(f_2);
            f_2 = f_1;
            f_1 = current;
        } else if (lastIndex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(0);
        }

        lastIndex++;
        return current;
    }
}
