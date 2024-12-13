import java.util.*;

public class StepTracker{
    int Goal;
    int Steps;
    int aDays;
    int tDays;

    public StepTracker(int g){
        Goal = g;
        Steps = 0;
        aDays= 0;
        tDays = 0;
    }

    public void addDailySteps(int s){
        tSteps = tSteps + s;
        tDays++;
        if(s >= Goal){
            acDays++;
        }
    }

    public int activeDays(){
        return aDays;
    }

    public double averageSteps(){
        return (double) tSteps/tDays;
    }
} 
