/**
 * Created by t00183399 on 28/11/2016.
 */
public enum Locations {
    TRALEE, KILLARNEY, DINGLE;

    public String toString() {
        switch (this) {
            case TRALEE:
                return "tralee";
            case KILLARNEY:
                return "killarney";
            case DINGLE:
                return "dingle";
            default:
                return "unknown location";

            }
        }
    }
