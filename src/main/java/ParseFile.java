import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParseFile {
    private final InputStream in = this.getClass().getClassLoader().getResourceAsStream("inputFile.csv");
    
    public static void main(String[] args) {
        ParseFile parseFile = new ParseFile();
        parseFile.processFile();
    }

    private Student createStudent(String[] data) {
        String name = data[0];
        String batch = data[1];
        String dorm = data[2];
        String room = data[3];
        String gpa = data[4];

        return new Student(name, batch, dorm, room, gpa);
    }

    private void processFile() {
        List<Student> students= readStudentsFromCSV();
        students.forEach(System.out::println);
    }

    private List<Student> readStudentsFromCSV() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            String line = br.readLine();
            while (line != null) {
                String[] items = line.split(",");
                Student Student = createStudent(items);
                students.add(Student);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}


