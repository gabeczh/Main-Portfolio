

public class App {
    public static void main(String[] args) throws Exception {

        //Create a room
        Room room = new Room();
        //Create Array
        Person[] roomArrTest = new Person[3];
        //Initialize array values
        roomArrTest[0] = new Person("ChewZhanHong",22);
        roomArrTest[1] = new Staff("ChewSiewLay",56,1000);
        roomArrTest[2] = new Person("TangYokeHowa",56);

        //Set room to Array
        room.setRoomPerson(roomArrTest);

        //Invoke show() method
        room.show(roomArrTest);
        
    }
}

class Person {
    
    public String name;
    public int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public String show(){
        return " Name: " + name + " Age: " + age;
    }


}

class Staff extends Person{

    private double salary;

    Staff(String name, int age, double salary){
        super(name,age);
        this.salary = salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String show(){
        return super.show() + " Salary: " + salary;
    }


}

class Room {

    private Person[] roomArr = new Person[3];

    public void setRoomPerson(Person[] roomArr){
        this.roomArr = roomArr;
    }

    public Person[] getRoomPerson(){
        return roomArr;
    }

    public void show(Person[] roomArr){

        for(int i = 0; i < roomArr.length; i++){
            System.out.println(" Room has the following Person(s): " + roomArr[i].show());
        }

        
    }
}