package model;

public class AlarmImpl {
    // Fields
    private int _hour;
    private int _minute;
    private int _second;

    // Constructor
    public AlarmImpl(int hour, int minute) {
        // VP
        if (hour > 24) {
            throw new IllegalArgumentException("Tried to create alarm at an hour > 24");
        }
        _hour = hour;
        _minute = minute;
        _second = 0;
    }

    // Methods
}
