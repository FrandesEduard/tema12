package ex4;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private DaysOfTheWeek day;
    private List<String> activities;

    public DaySchedule(DaysOfTheWeek day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public void setDay(DaysOfTheWeek day) {
        this.day = day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void addActivity (String activity) {
        activities.add(activity);
    }
    public void removeActivity (String activity) {
        activities.remove(activity);
    }

}
