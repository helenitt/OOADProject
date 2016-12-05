/**
 * Created by danie on 05.12.2016.
 */
public enum PianoType {
    GRAND, UPRIGHT, SPECIALIZED, ELECTRIC;

    public String toString(){
        switch(this){
            case GRAND:
                return "Grand";
            case UPRIGHT:
                return "Upright";
            case SPECIALIZED:
                return "Specialized";
            case ELECTRIC:
                return  "Electric";
            default:
                return "Unspecified";
        }
    }
}
