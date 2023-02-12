package model;

import java.sql.Time;

public interface Alarm {
    /** Get time of alarm */
    Time getTime();

    /** Get name of alarm */
    String getName();
}
