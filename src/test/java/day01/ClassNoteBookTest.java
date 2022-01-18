package day01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClassNoteBookTest {

    @Test
    void testAddStudent() {
        ClassNoteBook classNoteBook = new ClassNoteBook();
        // classNoteBook.addStudent(new Student(1, "Akos"));
        // classNoteBook.addStudent(new Student(2, "Barbi"));
        // classNoteBook.addStudent(new Student(3, "Mugli"));
        Student s = new Student(1, "Akos");
        classNoteBook.addStudent(s);
        System.out.println(classNoteBook.getNoteBook().get(s));
        assertEquals(0, classNoteBook.getNoteBook().get(s).size());
        classNoteBook.addMark(1, 5);
        assertEquals(1, classNoteBook.getNoteBook().get(s).size());
        assertTrue(classNoteBook.getNoteBook().keySet().contains(s));
    }

    @Test
    void testAddStudentInOrder(){
        ClassNoteBook classNoteBook = new ClassNoteBook();
        Student s = new Student(1, "John");
        Student s2 = new Student(3, "John");
        Student s3 = new Student(2, "John");
        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        // Set<Student> referenceSet = Set.of(s,s3,s2);
        // assertEquals(referenceSet, classNoteBook.getNoteBook().keySet());

        /*
        int i=1;
        for(Map.Entry<Student, List<Integer>> actual : classNoteBook.getNoteBook().entrySet()){
            assertEquals(i, actual.getKey().getID());
            i++;
        }
        */

        assertEquals(List.of(s,s3,s2), new ArrayList<Student>(classNoteBook.getNoteBook().keySet()));

    }

    @Test
    void testAddMark(){
        ClassNoteBook classNoteBook = new ClassNoteBook();
        Student s = new Student(1, "John");
        Student s2 = new Student(3, "John");
        Student s3 = new Student(2, "John");

        classNoteBook.addStudent(s);
        classNoteBook.addStudent(s2);
        classNoteBook.addStudent(s3);

        classNoteBook.addMark(2,5);
        assertEquals(5, classNoteBook.getNoteBook().get(s3).get(0));
    }

}
