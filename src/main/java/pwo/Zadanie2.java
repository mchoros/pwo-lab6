package pwo;

/**
 *
 * @author student
 */
public class Zadanie2 {

    /**
     *
     */
    public static final int FROM = 0,

    /**
     *
     */
    TO = 100;

    /**
     *
     */
    public static final String FILE_NAME = "lucas100.txt";

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Lucas wersja 1");
        boolean ok = SequenceTools2.writeToFile(
                new LucasGenerator(), FROM, TO, FILE_NAME);
        if (ok) {
            System.out.println("Wynik zapisany do pliku: " + FILE_NAME);
        } else {
            System.out.println("Błąd");
        }
    }
}

