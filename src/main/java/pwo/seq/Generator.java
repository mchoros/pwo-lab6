package pwo.seq;

import java.math.BigDecimal;
import pwo.utils.SequenceGenerator;

/**
 * Klasa abstrakcyjna Generator dziedzicząca po klasie SequenceGenerator
 * @author student
 */
abstract class Generator implements SequenceGenerator {

    protected int lastIndex = 0;
    protected BigDecimal current = null, f_1 = null, f_2 = null, f_3 = null;

    /**
     * Reset generatora do stanu początkowego
     */
    @Override
    public void reset() {
        lastIndex = 0;
    }
/**
 * Pobieranie wartości sekwencji
 * Następnie po spełnieniu warunków generuje dalej aż osiągnie żądany indeks
 * @param i
 * @return 
 */
    @Override
    public final BigDecimal getTerm(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastIndex) {
            reset();
        }
        while (lastIndex <= i) {
            nextTerm();
        }
        return current;
    }
}
