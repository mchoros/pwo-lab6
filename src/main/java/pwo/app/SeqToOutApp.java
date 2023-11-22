package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa generatora dziedzicząca po klasie SeqToFileApp
 * @author student
 */

public class SeqToOutApp extends SeqToFileApp {

    /**
     *Pobieranie argumentów dla aplikacji SeqToOutApp
     * @param args
     * @return
     */
    @Override
protected boolean getArgs(String[] args) {
   if(super.getArgs(args)) return true;

    return seqType != null && from >= 0 && to >= 0;
}

/**
 * Generowanie sekwencji liczb i wyświetlenie w konsoli
 * @return 
 */
@Override
protected boolean wirteSeq() {
 System.out.println(SequenceTools.getTermsAsColumn(
 seqType.getGenerator(), from, to));

 return true;
}

/**
 * Metoda uruchamiająca aplikację SeqToOutApp
 * @param args 
 */
 @Override
 public void run(String[] args) {
System.out.println("Sequence to terminal CLI app");

if (!getArgs(args)) {
System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to");
return;
}

wirteSeq();
}

}
