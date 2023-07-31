package ex4;

public class ex4 {
    public static void main(String[] args) {
        DaySchedule luni = new DaySchedule(DaysOfTheWeek.LUNI);
        luni.addActivity("merg la piata");
        luni.addActivity("spal masina");
        luni.addActivity("fac cumparaturi");
        System.out.println(luni.getActivities());
    }
}
