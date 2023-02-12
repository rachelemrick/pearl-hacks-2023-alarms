package model;

import model.Alarm;
import model.DAYS_OF_WEEK;
import model.Model;

import java.sql.Time;
import java.util.HashMap;

public class ModelImpl implements Model {
    // Contains all alarms, sorted by day of the week
    // Fields
    private HashMap<Time, Alarm> _m;
    private HashMap<Time, Alarm> _tu;
    private HashMap<Time, Alarm> _w;
    private HashMap<Time, Alarm> _th;
    private HashMap<Time, Alarm> _f;
    private HashMap<Time, Alarm> _sa;
    private HashMap<Time, Alarm> _su;

    // Constructor
    public ModelImpl() {
        _m = new HashMap<Time, Alarm>();
        _tu = new HashMap<Time, Alarm>();
        _w = new HashMap<Time, Alarm>();
        _th = new HashMap<Time, Alarm>();
        _f = new HashMap<Time, Alarm>();
        _sa = new HashMap<Time, Alarm>();
        _su = new HashMap<Time, Alarm>();
    }

    // Methods
    @Override
    public void createAlarm(Time time, DAYS_OF_WEEK day, String name) {
        if (day == DAYS_OF_WEEK.MONDAY) {
            _m.put(time, new AlarmImpl(time, name));
        } else if (day == DAYS_OF_WEEK.TUESDAY) {
            _tu.put(time, new AlarmImpl(time, name));
        } else if (day == DAYS_OF_WEEK.WEDNESDAY) {
            _w.put(time, new AlarmImpl(time, name));
        } else if (day == DAYS_OF_WEEK.THURSDAY) {
            _th.put(time, new AlarmImpl(time, name));
        } else if (day == DAYS_OF_WEEK.FRIDAY) {
            _f.put(time, new AlarmImpl(time, name));
        } else if (day == DAYS_OF_WEEK.SATURDAY) {
            _sa.put(time, new AlarmImpl(time, name));
        } else {
            _su.put(time, new AlarmImpl(time, name));
        }
    }

    @Override
    public void removeAlarm(Time time, DAYS_OF_WEEK day) {
        if (day == DAYS_OF_WEEK.MONDAY) {
            _m.remove(time);
        } else if (day == DAYS_OF_WEEK.TUESDAY) {
            _tu.remove(time);
        } else if (day == DAYS_OF_WEEK.WEDNESDAY) {
            _w.remove(time);
        } else if (day == DAYS_OF_WEEK.THURSDAY) {
            _th.remove(time);
        } else if (day == DAYS_OF_WEEK.FRIDAY) {
            _f.remove(time);
        } else if (day == DAYS_OF_WEEK.SATURDAY) {
            _sa.remove(time);
        } else {
            _su.remove(time);
        }
    }

}
