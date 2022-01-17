package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassNoteBook {
    List<Student> students = new ArrayList<>();
    private Map<Student, List<Integer> > noteBook = new TreeMap<>();



        public void addStudent(Student student){
        students.add(student);
    };

        public void addMark(int id, int mark){
            noteBook.put(id,mark );


        }
}
