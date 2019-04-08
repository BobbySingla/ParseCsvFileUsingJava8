import lombok.Data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
@Data
public class Student {
    private String name;
    private String batch;
    private String dorm;
    private String room;
    private String gpa;

    public Student(String name, String batch, String dorm, String room, String gpa) {
        this.name = name;
        this.batch = batch;
        this.dorm = dorm;
        this.room = room;
        this.gpa = gpa;
    }
}
