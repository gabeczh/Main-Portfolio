import java.util.*;

public class DateTest {

    public static void main(String[] args){
    
        Scanner myInput = new Scanner(System.in);

        int choice = getMenuChoice();

        while( choice != 4 ){
        
            int month;
            int day;
            int year;
            String monthName;
            Date date = null;
            try{
            
                switch( choice ){
                
                    case 1:
                        System.out.println("Enter Day of Month: ");
                        day = myInput.nextInt();
                        System.out.println("Enter Month (1-12): ");
                        month = myInput.nextInt();
                        System.out.println("Enter Year: ");
                        year = myInput.nextInt();

                        date = new Date(day, month, year);
                        break;

                    case 2:
                        System.out.println("Enter Month Name: ");
                        monthName = myInput.next();
                        System.out.println("Enter Day of Month: ");
                        day = myInput.nextInt();
                        System.out.println("Enter Year: ");
                        year = myInput.nextInt();

                        date = new Date(monthName, day, year);
                        break;

                    case 3:
                        System.out.println("Enter Day of Year: ");
                        day = myInput.nextInt();
                        System.out.println("Enter Year: ");
                        year = myInput.nextInt();

                        date = new Date(day, year);
                        break;

                }

                if( choice >=1 && choice <= 3 ){
                
                    System.out.printf("\n%s: %s\n%s: %s\n%s: %s\n\n", 
                            "DD/MM/YYYY", date.toString(), 
                            "Month DD, YYYY", date.toMonthNameDateString(),
                            "DDD YYYY", date.toDayDateString());

                    choice = getMenuChoice();
                }
            }
            catch(IllegalArgumentException e){
            
                System.out.println("Exception: " + e);
            }
        }
    }

    private static int getMenuChoice(){
    
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter 1 for format: DD/MM/YYYY ");
        System.out.println("Enter 2 for format: Month DD, YYYY ");
        System.out.println("Enter 3 for format: DDD YYYY ");
        System.out.println("Enter 4 to exit ");
        System.out.println("Choice: ");
        return myInput.nextInt();
    }
}
