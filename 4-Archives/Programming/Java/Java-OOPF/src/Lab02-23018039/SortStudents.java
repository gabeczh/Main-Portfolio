import java.util.*;

public class SortStudents{

    public static void main(String[] args){
    
        //Define Variables
        Scanner myInput = new Scanner(System.in);

        //ArrayList
        ArrayList<String> names = new ArrayList<String>();

        String name;

        //Initial Input
        System.out.println("Enter name (-1 to end loop): ");
        name = myInput.nextLine();

        //While Loop
        while(!name.equals("-1")){
            //If Statement Checker
            if(names.contains(name)){
            
                System.out.println("Duplicate!");
            }
            else {
            
                names.add(name);
            }

            System.out.print("Enter name: ");
            name = myInput.nextLine();

        }

        //Name Sorter/End Statement
        java.util.Collections.sort(names);

        System.out.println("The name(s) you have entered are: ");

        for(String n: names){
        
            System.out.print(n + ",");
        }

        //Name Deletion
        System.out.println("\nEnter name to be deleted: ");
        name = myInput.nextLine();
        names.remove(name);

        for(String n: names){
            
            System.out.print(n + ",");
        }

        //Name Search
        System.out.println("\nEnter name you want to search: ");
        name = myInput.nextLine();

        System.out.println("The name is at index: " + java.util.Collections.binarySearch(names,name));
    }
}
