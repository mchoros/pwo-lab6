package pwo.app;

/**
 * Klasa generatora Sequence reprezentująca główną klasę programu do generowania sekwencji liczb
 * @author student
 */

public class Sequence {

    /**
     * Główna metoda generatora sequence
     * @param args 
     */
    public static void main(String[] args) {
      //  (new SeqToFileApp()).run(args);
    switch(args.length){
    case 3: (new SeqToOutApp()).run(args); break;
    case 4: (new SeqToFileApp()).run(args); break;
    default: System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to [fileName]");
    }
}
}
