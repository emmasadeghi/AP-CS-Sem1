import java.util.;

public class RunningAverage{
    private int count;
    private double average;

    public RunningAverage(){

    }


    public void updateAverage(double newVal){
        double a = (double)count;
        a = a average;
        count ++;
        a = a + newVal;
        average = a/count;
    }

    public int processNewRatings(int num){
        int b = 0;
        int c = 0;
        while(b < num){
            double rating = getNewRating();
            if (rating >= 0){
                updateAverage(rating);
            }
            else{
                c++;
            }
            num++;
        }
        return c;
    }


    public double getNewRating(){

    }
}