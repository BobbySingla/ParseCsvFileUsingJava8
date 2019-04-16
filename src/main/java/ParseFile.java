import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParseFile {
    public List<Student> readStudentsFromCSV() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("inputFile.csv");
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
            try (Stream<String> stream = br.lines()) {
                stream
                        .skip(1)
                        .forEach(s -> {

                            String[] split = s.split(",");
                            String name = split[0];
                            Integer batch = Integer.parseInt(split[1]);
                            String dorm = split[2];
                            String room = split[3];
                            Double gpa = Double.parseDouble(split[4]);
                            students.add(new Student(name, batch, dorm, room, gpa));
                        });
            }
            return students;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}