package by.it.volchek.jd01_12;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by volchek on 17.04.18.
 */
public class TaskA1 {
    List<Integer> grades = new ArrayList<>();

    private void clearBad(List<Integer> grades){
       // grades.removeIf(i -> (i<4));
        //List<Integer> bad = Arrays.asList(1,2,3);
        //grades.removeAll(bad);
        Iterator<Integer> iterator = grades.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next<4) iterator.remove();

        }



    }

    public static void main(String[] args) {
        TaskA1 task = new TaskA1();
        for (int i = 0; i <25 ; i++) {
            task.grades.add((int)Math.ceil(Math.random()*10));

        }
        System.out.println(task.grades);
        task.clearBad(task.grades);
        System.out.println(task.grades);



    }

}
