import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class ParseFile {
    private Student createStudent(String[] data) {
        String name = data[0];
        String batch = data[1];
        String dorm = data[2];
        String room = data[3];
        String gpa = data[4];
        return new Student(name, batch, dorm, room, gpa);
    }

    public List<Student> readStudentsFromCSV() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("inputFile.csv");
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            while (line != null) {
                    String[] items = line.split(",");
                    Student student = createStudent(items);
                    students.add(student);
                    line = br.readLine();
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}