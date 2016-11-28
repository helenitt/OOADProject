
public class Piano {
    private int pianoID;
    private String pianoName;
    private float pianoCost;

    //default constructor
    public Piano(){
        this.pianoID = 0;
        this.pianoName = null;
        this.pianoCost = 0.0f;
    }

    //constructor
    public Piano(int pianoID, String pianoName, float pianoCost){
        this.pianoID = pianoID;
        this.pianoName = pianoName;
        this.pianoCost = pianoCost;
    }



}