/**
 * Created by T00171641.
 */

public class Piano {
    private int pianoID;
    private String pianoName;
    private float pianoCost;
    private int pianoQuantity;

    //default constructor
    public Piano(){
        this.pianoID = 0;
        this.pianoName = null;
        this.pianoCost = 0.0f;
        this.pianoQuantity = 0;
    }

    //constructor
    public Piano(int pianoID, String pianoName, float pianoCost, int pianoQuantity){
        this.pianoID = pianoID;
        this.pianoName = pianoName;
        this.pianoCost = pianoCost;
        this.pianoQuantity = pianoQuantity;
    }

    //accessor
    public int getPianoId(){
        return pianoID;
    }

    //mutator
    public void setPianoID(int pianoID){
        this.pianoID = pianoID;
    }

    public String getPianoName(){
        return pianoName;
    }

    public void setPianoName(String pianoName)
    {
        this.pianoName = pianoName;
    }

    public float getPianoCost(){
        return pianoCost;
    }

    public void setPianoCost(float pianoCost){
        this.pianoCost = pianoCost;
    }

    public int getPianoQuantity(){
        return pianoQuantity;
    }

    public void setPianoQuantity(int pianoQuantity){
        this.pianoQuantity = pianoQuantity;
    }

    @Override
    public String toString(){
        return "Piano ID: " + pianoID + "/nPiano Name: " + pianoName + "/nPiano Cost: €" + pianoCost + "/nPiano Quantity: " + pianoQuantity;
    }

}