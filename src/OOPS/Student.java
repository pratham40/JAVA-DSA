package OOPS;

//import javax.naming.Name;

public class Student {

    String name;
    int roll_no;
    double percentage;

    static int no_of_Students;

    Student(String name,int roll_no,double percentage) {
        this.name = name;
        this.roll_no = roll_no;
        this.percentage = percentage;
        no_of_Students++;
    }
//    public String getName(){
//       this.name="Pratham";
//        return name;
//    }
}
