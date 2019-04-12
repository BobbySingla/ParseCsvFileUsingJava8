import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer batch;
    private String dorm;
    private String room;
    private Double gpa;

}
