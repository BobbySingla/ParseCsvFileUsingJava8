import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
public class ParseCsvFile {
    private final InputStream in = this.getClass().getClassLoader().getResourceAsStream("inputFile.csv");

    public static void main(String[] args) throws IOException {
        ParseCsvFile parseCsvFile = new ParseCsvFile();
//        parseCsvFile.processFile();
    }

//    private List<String> processFile() {
//        BufferedReader br = new BufferedReader(new InputStreamReader(in));
//        List<Student> inputList=new ArrayList<>();
//        inputList = br.lines().filter(s -> s.contains("3.2")).map(String::toUpperCase).collect(Collectors.toList());
//        inputList.forEach(System.out::println);
//        return inputList;
//    }
}
