import java.util.LinkedList;
import java.util.List;

/**
 * Created by danie on 05.12.2016.
 */
public class UserPianos{

    private final List<Piano> boughtPianos;

    public UserPianos(){
        boughtPianos = new LinkedList<>();
    }

    public void addPiano(int pianoID, String pianoName, PianoTypes pianoTypes, float pianoCost, int pianoQuantity){
        Piano newPiano = new Piano(pianoID, pianoName, pianoTypes, pianoCost, pianoQuantity);
        boughtPianos.add(newPiano);
    }

    public String listAllBoughtPianos(){
        String pianoList="\nList of all bought pianos:";

        for (Piano piano:boughtPianos) {
            pianoList += "\n" + piano.toString();
        }
        return pianoList;
    }
}
