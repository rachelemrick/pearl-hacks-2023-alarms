package controller;
import model.Alarm;
import model.DAYS_OF_WEEK;
import model.Model;

import java.sql.Time;

public class AlarmControllerImpl implements AlarmController {
    // Fields
    private Model _model;

    // Constructor
    AlarmControllerImpl(Model model) {
        _model = model;
    }

    // Methods
    @Override
    public void createAlarm(Time time, DAYS_OF_WEEK day, String name) {
        _model.createAlarm(time, day, name);
    }

    @Override
    public void removeAlarm(Time time, DAYS_OF_WEEK day) {
        _model.removeAlarm(time, day);
    }
}
