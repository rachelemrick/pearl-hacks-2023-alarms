package controller;

import model.DAYS_OF_WEEK;

import java.sql.Time;

public interface AlarmController {
    /** Creates an alarm */
    void createAlarm(Time time, DAYS_OF_WEEK day, String name);

    /** Removes an alarm */
    void removeAlarm(Time time, DAYS_OF_WEEK day)
}
