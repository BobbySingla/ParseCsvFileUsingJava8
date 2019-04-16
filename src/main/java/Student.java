import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String name;
    private Integer batch;
    private String dorm;
    private String room;
    private Double gpa;


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
            String name1="bobby";
            if(name==null){
                this.name = name1;
            return this;}
            else {
                this.name = name;
                return this;
            }

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
            String dorm1="House";
            if(dorm==null){
                this.dorm = dorm1;
                return this;}
            else {
                this.dorm = dorm;
                return this;
            }
        }

        public StudentBuilder room(String room) {
            String room1="414-C";
            if(room1==null){
                this.room = room1;
                return this;}
            else {
                this.room = room;
                return this;
            }
        }

        public StudentBuilder gpa(Double gpa) {
            Double gpa1=5.3;
            if(gpa==null){
                this.gpa = gpa1;
                return this;}
            else {
                this.gpa = gpa;
                return this;
            }
        }

        public Student build() {
            return new Student(name, batch, dorm, room, gpa);
        }

        public String toString() {
            return "Student.StudentBuilder(name=" + this.name + ", batch=" + this.batch + ", dorm=" + this.dorm + ", room=" + this.room + ", gpa=" + this.gpa + ")";
        }
    }
}
