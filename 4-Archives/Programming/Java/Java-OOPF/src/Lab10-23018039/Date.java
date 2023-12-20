public class Date {

    private int day;
    private int month;
    private int year;

    public Date(){
    
        day = 1;
        month = 1;
        year = 1900;
    }

    public Date(int d, int m, int y){
    
        day = d;
        month = m;
        year = y;
    }

    public void setDay(int d){
    
        day = d;
    }

    public void setMonth(int m){
    
        month = m;
    }

    public void setYear(int y){
    
        year = y;
    }

    public int getDay(){
    
        return day;
    }

    public int getMonth(){
    
        return month;
    }

    public int getYear(){
    
        return year;
    }

    public String toString(){
    
        return String.format("%02d/%02d/%04d", getDay(), getMonth(), getYear());
    }
}
