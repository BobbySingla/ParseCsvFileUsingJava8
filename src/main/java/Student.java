import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private String batch;
    private String dorm;
    private String room;
    private String gpa;

}
