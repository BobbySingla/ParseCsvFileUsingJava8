import java.util.List;

public class FilterData {
    public List<Student> filterdetails(List<Student> studentList) {
        studentList.forEach(student -> {
            if (student.getName().equals("Sally")) {
                student.setName("Changed");
            }
        });

        return studentList;
    }
}
