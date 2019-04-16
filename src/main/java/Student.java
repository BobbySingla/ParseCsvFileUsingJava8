import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    //    @Value("#{configproperties['properties.name']}")


    private String name;
    private Integer batch;
    private String dorm;
    private String room;
    private Double gpa;

    public Student(String name, Integer batch, String dorm, String room, Double gpa) {
        this.name = name;
        this.batch = batch;
        this.dorm = dorm;
        this.room = room;
        this.gpa = gpa;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String name;
        private Integer batch;
        private String dorm;
        private String room;
        private Double gpa;

        StudentBuilder() {
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder batch(Integer batch) {
            Integer batch1 = 3;
            if (batch == null) {
                this.batch = batch1;
                return this;
            } else {
                this.batch = batch;
                return this;
            }
        }

        public StudentBuilder dorm(String dorm) {
            this.dorm = dorm;
            return this;
        }

        public StudentBuilder room(String room) {
            this.room = room;
            return this;
        }

        public StudentBuilder gpa(Double gpa) {
            this.gpa = gpa;
            return this;
        }

        public Student build() {
            return new Student(name, batch, dorm, room, gpa);
        }

        public String toString() {
            return "Student.StudentBuilder(name=" + this.name + ", batch=" + this.batch + ", dorm=" + this.dorm + ", room=" + this.room + ", gpa=" + this.gpa + ")";
        }
    }
}
