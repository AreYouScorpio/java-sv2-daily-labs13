package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ClassNoteBook {
    List<Student> students = new ArrayList<>();
    private Map<Student, List<Integer>> noteBook = new TreeMap<>();


    public Map<Student, List<Integer>> getNoteBook() {
        return noteBook;
    }

    public void addStudent(Student student) {
        noteBook.put(student, new ArrayList<>());
    }

    ;

    public void addMark(int id, int mark) {
        for (Map.Entry<Student, List<Integer>> actual : noteBook.entrySet()) {
            if (actual.getKey().getID() == id) {
                actual.getValue().add(mark);
            }


        }
    }
}
