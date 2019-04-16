import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class GenerateOutput {
    private final Path outputFilepath = Paths.get("src/main/resources/", "OutputFile.csv");

    public void generateFile(List<Student> student) throws IOException {
        OutputStream os = new FileOutputStream(outputFilepath.toFile());
        PrintWriter fileWriter = new PrintWriter(os);
        fileWriter.append("name,batch,dorm,room,gpa\n");

        student.forEach(rowData -> {

            fileWriter.append(rowData.getName())
                    .append(",")
                    .append(String.valueOf(rowData.getBatch()))
                    .append(",")
                    .append(rowData.getDorm())
                    .append(",")
                    .append(rowData.getRoom())
                    .append(",")
                    .append(String.valueOf(rowData.getGpa()))
                    .append("\n");

        });
        System.out.println("Successful executed");
        fileWriter.flush();
        fileWriter.close();
    }
}
