import java.util.LinkedList;
import java.util.List;

/**
 * Created by T00171641 on 04.12.2016.
 */

public class BuyPiano {
    private static String fTitle = "Buy Piano";
    private final List<Piano> pianos;

    public BuyPiano(){
        pianos = new LinkedList<>();
        addPiano(1, "Alden", PianoType.GRAND, 7000, 5);
        addPiano(2, "Allmendiger", PianoType.ELECTRIC, 10500, 1);
        addPiano(3, "Berger", PianoType.SPECIALIZED, 17000, 15);
        addPiano(4, "Dassel", PianoType.UPRIGHT, 6500, 26);
        addPiano(5, "Fazioli", PianoType.GRAND, 8500, 4);
        addPiano(6, "Grover", PianoType.UPRIGHT, 7499, 2);
    }

    public static String getTitle(){
        return fTitle;
    }

    public void addPiano(int pianoID, String pianoName, PianoType pianoType, float pianoCost, int pianoQuantity){
        Piano newPiano = new Piano(pianoID, pianoName, pianoType, pianoCost, pianoQuantity);
        pianos.add(newPiano);
    }

    public void buyPiano(int pianoID, int pianoQuantity){

    }
}
