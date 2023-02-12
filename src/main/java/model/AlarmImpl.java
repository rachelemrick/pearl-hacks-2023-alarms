package model;

import java.sql.Time;

public class AlarmImpl implements Alarm {
    // Fields
    private Time _time;
    private String _name;

    // Constructor
    public AlarmImpl(Time time, String name) {
        _time = time;
        _name = name;
    }

    // Methods
    @Override
    public Time getTime() {
        return _time;
    }

    @Override
    public String getName() {
        return _name;
    }

}
