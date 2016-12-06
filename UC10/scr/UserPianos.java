import java.util.LinkedList;
import java.util.List;

/**
 * Created by danie on 05.12.2016.
 */
public class UserPianos{
    //will be responsible for remembering what user bought
    private final List<Piano> boughtPianos;

    public UserPianos(){
        boughtPianos = new LinkedList<>();
    }

    public void addPiano(int pianoID, String pianoName, PianoTypes pianoTypes, float pianoCost, int pianoQuantity){
        Piano newPiano = new Piano(pianoID, pianoName, pianoTypes, pianoCost, pianoQuantity);
        boughtPianos.add(newPiano);
    }

    public void addPiano(Piano piano){
        boughtPianos.add(piano);
    }

    public void setPianoQuantity(int pianoID ,int quantity){
        boughtPianos.get(pianoID-1).setPianoQuantity(quantity);
    }

    public String listAllBoughtPianos(){
        String pianoList="\nList of all bought pianos:";

        for (Piano piano:boughtPianos) {
            pianoList += "\n" + piano.toString();
        }
        return pianoList;
    }
}
