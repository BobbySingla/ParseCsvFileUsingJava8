import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GenerateOutput {
    private final Path outputFilepath = Paths.get("src/main/resources/", "OutputFile.csv");
    public void generateFile(List<Student> student) throws IOException {
        OutputStream os = new FileOutputStream(outputFilepath.toFile());
        PrintWriter fileWriter = new PrintWriter(os);
//        Iterator iterator = student.iterator();
//        while (iterator.hasNext()) {
//            fileWriter.append((Character) iterator.next());
//        }
//        List<String> s = student.stream().map(Object::toString).collect(Collectors.toList());
//        System.out.println(s);
        fileWriter.write("name,batch,dorm,room,gpa\n");
        for (Student rowData : student) {

            fileWriter.write(rowData.getName()+"," +rowData.getBatch()+","+rowData.getDorm()+","+rowData.getRoom()
            +","+rowData.getGpa()+"\n");
//            fileWriter.append(String.join(",",rowData));
//            fileWriter.append("\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
