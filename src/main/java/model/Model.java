package model;

import model.DAYS_OF_WEEK;

import java.sql.Time;

public interface Model {
    /** Creates an alarm on a given day */
    void createAlarm(Time time, DAYS_OF_WEEK day, String name);

    /** Removes an alarm on a given day */
    void removeAlarm(Time time, DAYS_OF_WEEK day);
}
