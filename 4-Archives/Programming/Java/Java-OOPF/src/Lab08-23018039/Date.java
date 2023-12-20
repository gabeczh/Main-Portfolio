public class Date {

    private int day;
    private int month;
    private int year;
    private static final String[] monthNames = {"January", "February", "March", "April", 
        "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(){
    
        this(1,1,2012);
    }

    public Date(int dd, int mm, int yyyy){
    
        setYear( yyyy );
        setMonth( mm );
        setDay( dd );

    }

    public Date(String mm, int dd, int yyyy){

        setYear( yyyy );
        convertFromMonthName( mm );
        setDay( dd );
    
    }

    public Date(int ddd, int yyyy){
    
        setYear( yyyy );
        convertFromDayOfYear( ddd );
    }

    public void setDay(int dd){
    
        if( dd >= 1 && dd <= daysInMonth() ){
        
            day = dd;
        }else{
        
            throw new IllegalArgumentException("Day is wrong!");
        }
    }

    public void setMonth(int mm){
    
        if( mm > 0 && mm <= 12 ){
        
            month = mm;
        }else{
        
            throw new IllegalArgumentException("Month is wrong!");
        }
    }

    public void setYear(int yyyy){
    
        year = yyyy;
        if( yyyy >= 1900 && yyyy <= 2100 ){
        
            year = yyyy;
        }else{
        
            throw new IllegalArgumentException("Year is wrong!");
        }
    }

    public String toString(){
    
        return String.format( "%d/%d/%d", day, month, year);
    }

    public String toMonthNameDateString(){
    
        return String.format( "%s %d, %d", monthNames[ month - 1 ], day, year);
    }

    public String toDayDateString(){
    
        return String.format( "%d %d", convertToDayOfYear(), year);
    }

    private void convertFromMonthName( String monthName ){
    
        for( int subscript = 0; subscript < 12; subscript++){
        
            if( monthName.equals(monthNames[ subscript ]) ){

                setMonth( subscript + 1 );
                return;
            }
        }

        setMonth(1);
    }
    private int daysInMonth(){
    
        return leapYear() && month == 2 ? 29 : monthDays[ month - 1 ];
    }

    private boolean leapYear(){

        if( year % 400 == 0 || (year % 4 == 0 && year % 100 !=0 ) ){
        
            return true;
        }else{
        
            return false;
        }
    }

    private void convertFromDayOfYear( int ddd ){
    
        int dayTotal = 0;

        if( ddd < 1 || ddd > 366 ){
        
            ddd = 1;

        }
        setMonth(1);

        for( int m = 1; m < 13 && (dayTotal + daysInMonth() ) < ddd; ++m){
        
            dayTotal += daysInMonth();
            setMonth( m + 1 );
        }
        setDay( ddd - dayTotal );
    }

    private int convertToDayOfYear(){
    
        int ddd = 0;

        for( int m = 1; m < month; ++m){
        
            if( leapYear() && m == 2 ){
            
                ddd += 29;
            }else{
            
                ddd += monthDays[ m -1 ];
            }

        }
        ddd +=  day;
        return ddd;
    }

}
