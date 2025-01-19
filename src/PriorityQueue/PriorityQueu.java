package PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueu {
    static class Student{
        String name;
        Integer rollNo;
        Integer marks;

        public Student(String name, Integer rollNo, Integer marks) {
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    ", marks=" + marks +
                    '}';
        }
    }

    public static class StudentComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
                if (s1.marks>s2.marks){
                    return 1;
                } else if (s2.marks>s1.marks) {
                    return -1;
                }else {
                    if (s1.rollNo>s2.rollNo){
                        return 1;
                    }else if (s2.rollNo>s1.rollNo){
                        return -1;
                    }
                }
            return 0;
        }
    }


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new StudentComparator()); // max heap
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // max heap
        List<Student> students = new ArrayList<>();
        pq.add(12);
        pq.remove();
        System.out.println(pq.peek());

        Student student1 = new Student("raghav",1,43);
        Student student2 = new Student("radhe",2,56);
        students.add(student1);
        students.add(student2);
        students.sort(new StudentComparator());
        System.out.println(students);
//        pq.add(student1);

    }
}
