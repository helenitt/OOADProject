/**
 * Created by t00183399 on 28/11/2016.
 */
public enum Locations {
    TRALEE, KILLARNEY, DINGLE;

    public String toString() {
        switch (this) {
            case TRALEE:
                return "Tralee";
            case KILLARNEY:
                return "Killarney";
            case DINGLE:
                return "Dingle";
            default:
                return "Unknown Location";

            }
        }
    }
