package HeapAndPriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

class Student implements Comparable<Student>{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + this.marks +
                ", name='" + this.name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        return that.marks-this.marks; /// desc
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student student = (Student) obj;
            if (this.marks==student.marks && this.name.compareTo(student.name)==0){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
}

public class MyPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1); // min
        pq.offer(2);
        pq.offer(0);
        pq.offer(10);
//        System.out.println(pq.peek());

        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(1); // max
        maxpq.offer(2);
        maxpq.offer(10);
        maxpq.offer(0);
//        System.out.println(maxpq.peek());

        PriorityQueue<Student> students=new PriorityQueue<>();
        students.add(new Student(10,"a"));
        students.add(new Student(30,"b"));
        students.add(new Student(80,"c"));
        students.add(new Student(50,"d"));
        students.add(new Student(30,"e"));

        System.out.println(students.peek());
        System.out.println(students.contains(new Student(10,"a")));


    }
}
