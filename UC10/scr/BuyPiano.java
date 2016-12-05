/**
 * Created by T00171641 on 04.12.2016.
 */

public class BuyPiano {
    private static String fTitle = "Buy Piano";
    private static String fDesc = "Allows to buy Piano";
    Piano piano;

    public BuyPiano(){
        piano = new Piano();
    }

    public BuyPiano(int pianoID, String pianoName, float pianoCost, int pianoQuantity)
    {
        piano = new Piano(pianoID, pianoName, pianoCost, pianoQuantity);
    }

    public static String getTitle(){
        return fTitle;
    }

    public static String getDesc(){
        return fDesc;
    }
}
