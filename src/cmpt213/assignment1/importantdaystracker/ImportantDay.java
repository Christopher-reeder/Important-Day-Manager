package cmpt213.assignment1.importantdaystracker;

/**
 * Represents an ImportantDay with basic attributes, 
 * such as name, date, and description.
 */
public class ImportantDay {

    /** Attribues of the day */
    private String name;
    private String date;
    private String description;

    /**
     * Constructs an ImportantDay object with the given attributes.
     *
     * @param name        name of the important day
     * @param date        date of the important day (YYYY-MM-DD)
     * @param description description of the important day
     */
    public ImportantDay(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    /**
     * get the name of this important day.
     *
     * @return name of this day
     */
    public String getName() {
        return name;
    }

    /**
     * get the date of this important day.
     *
     * @return the date in YYYY-MM-DD format
     */
    public String getDate() {
        return date;
    }

    /**
     * get the description of this important day.
     *
     * @return the description for this day
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets a new name for this important day.
     *
     * @param name the new name of the day
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets a new date for this important day.
     *
     * @param date the new date (YYYY-MM-DD)
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Sets a new description for this important day.
     *
     * @param description the new description for the day
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns a string representation of the ImportantDay object.
     * This method overrides the default toString implementation in the Object class.
     *
     * @return a string containing the name, date, and description of the day
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Date: " + date + ", Description: " + description;
    }
}
