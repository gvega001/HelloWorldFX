package online.dev4you;

import java.util.ArrayList;

public class ListOfStudents {
    ArrayList<String> merge(String[] words, String[] more){
        ArrayList<String> student  = new ArrayList<>();
        for(String w: words)student.add(w);
        for(String w: more)student.add(w);
        return student;
    }

}
