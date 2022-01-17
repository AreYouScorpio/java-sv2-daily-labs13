package day01;

public class Student implements Comparable<Student>{
    int ID;
    String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return ID-o.ID;
    }
}
