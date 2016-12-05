import java.util.LinkedList;
import java.util.List;

/**
 * Created by T00171641 on 04.12.2016.
 */

public class BuyPiano {
    private static String fTitle = "Buy Piano";
    private static String fDesc = "Allows to buy Piano";
    private final List<Piano> pianos;

    public BuyPiano(){
        pianos = new LinkedList<>();
    }

    public static String getTitle(){
        return fTitle;
    }

    public static String getDesc(){
        return fDesc;
    }
}
