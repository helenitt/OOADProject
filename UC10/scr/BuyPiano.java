import java.util.LinkedList;
import java.util.List;

/**
 * Created by T00171641 on 04.12.2016.
 */

public class BuyPiano {
    private static String fnTitle = "Buy Piano";
    private final List<Piano> pianos;
    private String message = "";

    public BuyPiano(){
        pianos = new LinkedList<>();
        addPiano(1, "Alden", PianoTypes.GRAND, 7000, 5);
        addPiano(2, "Allmendiger", PianoTypes.ELECTRIC, 10500, 1);
        addPiano(3, "Berger", PianoTypes.SPECIALIZED, 17000, 15);
        addPiano(4, "Dassel", PianoTypes.UPRIGHT, 6500, 26);
        addPiano(5, "Fazioli", PianoTypes.GRAND, 8500, 4);
        addPiano(6, "Grover", PianoTypes.UPRIGHT, 7499, 2);
    }

    public static String getTitle(){
        return fnTitle;
    }

    private void addPiano(int pianoID, String pianoName, PianoTypes pianoTypes, float pianoCost, int pianoQuantity){
        Piano newPiano = new Piano(pianoID, pianoName, pianoTypes, pianoCost, pianoQuantity);
        pianos.add(newPiano);
    }

    public void buyPiano(int pianoID, int pianoQuantity){
        //System.out.println(pianos.get(pianoID-1).toString());
        try
        {
            if(pianos.get(pianoID-1).getPianoQuantity() >= pianoQuantity)
            {
                pianos.get(pianoID-1).setPianoQuantity(pianos.get(pianoID-1).getPianoQuantity() - pianoQuantity);
                message = pianoQuantity + " pianos were bought. Seller will contact you later to decide the payment and shipping.";
            }
            else if(pianos.get(pianoID-1).getPianoQuantity() != 0) {
                message = "You tried to buy " + pianoQuantity + " pianos while only " + pianos.get(pianoID-1).getPianoQuantity() +
                        " pianos were available. " + pianos.get(pianoID-1).getPianoQuantity() + " pianos were bought. " +
                        "Seller will contact you later to decide the payment and shipping." ;
                pianos.get(pianoID - 1).setPianoQuantity(0);
            } else
                message = "User wanted to buy a piano but the stock is empty";
        }
        catch(IndexOutOfBoundsException c){
            message = "No piano with such ID exist!";
        }
        //System.out.println(pianos.get(pianoID-1).toString());
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }
}
