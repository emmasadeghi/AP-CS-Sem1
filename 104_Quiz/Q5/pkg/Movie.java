package pkg;

public class Movie{
    private String movieName;
    private double rating;
    private int numRating;
    private int revenue;
    
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRating = 33;
        revenue = 623357910;
    }
    
    public Movie(String mov, double rate, int num, int rev){
        movieName = mov;
        rating = rate;
        numRating = num;
        revenue = rev;
    }
    
    public void movieToString(){
        System.out.println("Movie: "+movieName);
        System.out.println("Rating: "+rating);
        System.out.println("Number of Ratings: "+numRating);
        System.out.println("Revenue: "+revenue);
        System.out.println(" ");
    }
    
    public String getMovieName(){
        return this.movieName; 
    }
    
    public int getRevenue(){
        return this.revenue;
    }
    
    public double getRating(){
        return this.rating;
    }
    
    public void addRating(double a){
        double b = (double)numRating;
        b=b*rating;
        numRating++;
        b=b+a;
        rating=b/numRating;
    }
    
    public boolean compareRatings(Movie a){
     return this.rating > a.getRating();   
    }
    
    public String revenueToString(){
        int r=revenue;
        int a=(int)r/100000000;
        int b=(r-(a*100000000))/10000000;
        int c=((r-(a*100000000+b*10000000))/1000000);
        int d=((r-(a*100000000+b*10000000+c*100000))/1000000);
        int e=((r-(a*100000000+b*10000000+c*100000+d*10000))/100000);
        int f=((r-(a*100000000+b*10000000+c*100000+d*10000+e*1000))/10000);
        int g=((r-(a*100000000+b*10000000+c*100000+d*10000+e*1000+f*100))/1000);
        int h=((r-(a*100000000+b*10000000+c*100000+d*10000+e*1000+f*100+g*10))/100);
        int i=((r-(a*100000000+b*10000000+c*100000+d*10000+e*1000+f*100+g*10+h*1))/100);
        String newRev = (a+b+c+","+d+e+f+","+g+h+i);
        return newRev;
    }
    
    public Movie pirateMovie(){
        return new Movie(movieName, rating, numRating, revenue);
    }
}
