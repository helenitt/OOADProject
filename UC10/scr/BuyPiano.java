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
        addPiano(1, "Alden", 7000, 5);
        addPiano(2, "Allmendiger", 7000, 1);
        addPiano(3, "Berger", 7000, 15);
        addPiano(4, "Dassel", 7000, 26);
        addPiano(5, "Fazioli", 7000, 4);
        addPiano(6, "Grover", 7000, 2);
    }

    public static String getTitle(){
        return fTitle;
    }

    public void addPiano(int pianoID, String pianoName, float pianoCost, int pianoQuantity){
        Piano newPiano = new Piano(pianoID, pianoName, pianoCost, pianoQuantity);
        pianos.add(newPiano);
    }
}
