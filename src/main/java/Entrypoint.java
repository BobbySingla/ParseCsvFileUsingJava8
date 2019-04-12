import java.io.IOException;
import java.util.List;

public class Entrypoint {
    public static void main(String[] args) throws IOException {
        Entrypoint parseCsvFile = new Entrypoint();
        parseCsvFile.entryPoint();
    }

    private void entryPoint() throws IOException {
        ParseFile parseFile = new ParseFile();
        List<Student> students = parseFile.readStudentsFromCSV();
//        students.forEach(System.out::println);

        FilterData filterData = new FilterData();
        List<Student> student = filterData.filterdetails(students);
//        student.forEach(System.out::println);

        GenerateOutput generateOutput = new GenerateOutput();
        generateOutput.generateFile(student);
    }

}
