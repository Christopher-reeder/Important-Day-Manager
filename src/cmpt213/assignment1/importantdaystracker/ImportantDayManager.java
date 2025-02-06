package cmpt213.assignment1.importantdaystracker;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages a list of ImportantDay objects with methods such as
 * add, remove, search, and getAll the list.
 */
public class ImportantDayManager {

    private ArrayList<ImportantDay> days;

    /** Constructs an ImportantDayManager with an empty list. */
    public ImportantDayManager() {
        days = new ArrayList<>();
    }

    /**
     * Adds a new ImportantDay object to the manager.
     *
     * @param day the ImportantDay to be added
     */
    public void addDay(ImportantDay day) {
        days.add(day);
    }

    /**
     * Removes an ImportantDay object from the manager by name.
     *
     * @param name the name of the ImportantDay to remove
     * @return true if the day was found and removed, false otherwise
     */
    public boolean removeDayByName(String name) {
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i).getName().equalsIgnoreCase(name)) {
                days.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Searches for important days by name.
     *
     * @param name the name to search for
     * @return a list of ImportantDay objects matching the name
     */
    public List<ImportantDay> searchDaysByName(String name) {
        ArrayList<ImportantDay> result = new ArrayList<>();
        for (ImportantDay day : days) {
            if (day.getName().equalsIgnoreCase(name)) {
                result.add(day);
            }
        }
        return result;
    }

    /**
     * Returns a list of all ImportantDay objects currently managed.
     *
     * @return a list of ImportantDay objects
     */
    public ArrayList<ImportantDay> getAllDays() {
        return days;
    }
}